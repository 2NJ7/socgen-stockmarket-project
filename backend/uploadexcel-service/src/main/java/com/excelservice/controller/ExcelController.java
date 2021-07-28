package com.excelservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.excelservice.dto.ExcelDto;

@RestController
@RequestMapping("/excelsheet")
public class ExcelController {
	
	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//	   // Do any additional configuration here
//	   return builder.build();
//	}
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("")
	public String check() {
		return "Successful Hit";
	}
	@PostMapping("/check")
	public ExcelDto xcs(@RequestBody ExcelDto data) {
		return data;
	}
	
	@PostMapping("/uploadData")
	public ResponseEntity<List<ExcelDto>> addExcelData(@RequestBody List<ExcelDto> data) {
		String apiUrl = "http://company-service/company/addStockPrices";
		List<ExcelDto> failedInserts = restTemplate.postForEntity(apiUrl, data, ArrayList.class).getBody();
		if(failedInserts.size() == 0) {
			return ResponseEntity.ok(failedInserts);
		
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(failedInserts);
		}
	}

}

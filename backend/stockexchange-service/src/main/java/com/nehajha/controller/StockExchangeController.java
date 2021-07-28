package com.nehajha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nehajha.entity.StockExchange;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stockExchange")
public class StockExchangeController {
	
	private RestTemplate restTemplate;
	@Autowired
	private com.nehajha.service.StockExchangeService stockExchangeService;
	
	@GetMapping("")
    public String list() {
        return "Succesful hit";
    }
	
	@GetMapping("/exchanges")
	public ResponseEntity<List<com.nehajha.entity.StockExchange>> getStockExchanges(){
		return ResponseEntity.ok(stockExchangeService.getAllStockExchanges());
	}
	
	@GetMapping("/exchanges/{id}")
	public ResponseEntity getStockExchangeById(@PathVariable(value = "id") int id){
		com.nehajha.entity.StockExchange exchange  = stockExchangeService.getStockExchangeById(id);
		if(exchange != null)
			return ResponseEntity.ok(exchange);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Stock Exchange found for the given Id");
	}

	@PostMapping("/exchanges")
	public ResponseEntity<com.nehajha.entity.StockExchange> addStockExchange(@RequestBody com.nehajha.entity.StockExchange stockExchange){
		return ResponseEntity.ok(stockExchangeService.addStockExchange(stockExchange));
	}
	
	@GetMapping("/company/{exchangeId}")
	public ResponseEntity getCompaniesByExchangeId(@PathVariable(value = "exchangeId") int id) {
		String apiUrl = "http://company-service/company/getCompanyByExchange/" + id;
		ResponseEntity response = restTemplate.getForEntity(apiUrl , String.class);
		return response;
	}

}

package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Stock;
import com.company.service.StockService;

@RestController
@RequestMapping("company")
public class StockController {
	@Autowired
	private StockService stockService;
	
	@GetMapping("/stocks")
	public ResponseEntity<List<Stock>> getAllStocks(){
		return ResponseEntity.ok(stockService.getAllStocks());
	}
	
	@PostMapping("/stocks")
	public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
		return ResponseEntity.ok(stockService.addStock(stock));
	}

}

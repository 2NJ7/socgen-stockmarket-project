package com.company.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.company.entity.Stock;

import com.company.repository.StockRepository;

@Service
public class StockService {
	@Autowired
	private StockRepository stockRepository;
	
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}
	
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}
	

}

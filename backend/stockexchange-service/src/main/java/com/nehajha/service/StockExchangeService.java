package com.nehajha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockExchangeService {
	@Autowired
	private com.nehajha.repositry.StockExchangeRepositry stockExchangeRepository;
	
	public List<com.nehajha.entity.StockExchange> getAllStockExchanges(){
		return stockExchangeRepository.findAll();
	}
	
	public com.nehajha.entity.StockExchange addStockExchange(com.nehajha.entity.StockExchange stockExchange) {
		return stockExchangeRepository.save(stockExchange);
	}
	
	public com.nehajha.entity.StockExchange getStockExchangeById(int id) {
		Optional<com.nehajha.entity.StockExchange> stockExchangeOptional = stockExchangeRepository.findById(id);
		if(stockExchangeOptional.isPresent())
			return stockExchangeOptional.get();
		return null;
	}


}

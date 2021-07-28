package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dto.Exceldto;
import com.company.entity.StockPrice;
import com.company.repository.StockPriceRepository;

@Service
public class StockPriceService {
	@Autowired
	private StockPriceRepository stockPriceRepository;
	
	public List<StockPrice> getAllStockPrices() {
		return stockPriceRepository.findAll();
	}
	
	public List<Exceldto> addStockPrices(List<Exceldto> excelData){
		List<Exceldto> failedInserts = new ArrayList<>();
		for(Exceldto data:excelData) {
			try {
				stockPriceRepository.addStockPrice(data.getCompanyId(), data.getExchangeId(), data.getPrice(), data.getTimestamp());
			} catch(Exception e) {
				failedInserts.add(data);
			}			
		}
		return failedInserts;
	}
	
	public List<StockPrice> getStockPriceByCompany(int companyId, int exchangeId, String before, String after){
		return stockPriceRepository.getStockPricesByCompany(companyId, exchangeId, before, after);
	}

}

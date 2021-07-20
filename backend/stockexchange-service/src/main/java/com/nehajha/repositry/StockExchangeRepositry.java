package com.nehajha.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nehajha.entity.StockExchange;

@Repository
public interface StockExchangeRepositry extends JpaRepository<StockExchange, Integer> {

}

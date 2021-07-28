package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

}

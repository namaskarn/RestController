package com.shiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.entity.StockPrice;
@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
	
	public StockPrice findByCompanyName(String companyName);//here using companyName i want stockprice
	

}

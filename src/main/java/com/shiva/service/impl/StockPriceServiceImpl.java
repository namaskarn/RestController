package com.shiva.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.entity.StockPrice;
import com.shiva.repository.StockPriceRepository;
import com.shiva.service.StockPriceService;
@Service
public class StockPriceServiceImpl implements StockPriceService {
	
	@Autowired
	private StockPriceRepository stockPriceRepo; 

	@Override //from here we will interact with dao layer
	public Double getStockPrice(String companyName) {
		// TODO Auto-generated method stub
		
		
		StockPrice stockPrice=stockPriceRepo.findByCompanyName(companyName);//using companyname getting stock price but if not found then exception
	if(stockPrice==null)
	{
		throw new CompanyNotFoundException("Company Not Found");
		
		
	}
		
		
		
		
		return stockPrice.getCompanyPrice;// if every thing there i want to get back company price means paisa leyara farka
	}

}

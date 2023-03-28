package com.shiva.rest;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.service.StockPriceService;

@RestController
@RequestMapping("/price")
public class StockPriceRestController {
//http://localhost:1111/price/stockPrice/HCL
	@Autowired
	private Environment env;
	
	@Autowired
	private StockPriceService stockPriceService;
	@GetMapping(value="/stockPrice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("companyName")String companyName)
	{
		
		Double stockPrice=stockPriceService.getStockPrice(companyName);
		System.out.println("Request Processed by server running on ::");
		env.getProperties("local.server.port");
		return new ResponseEntity<>(stockPrice,HttpStatus.OK);
	}

}

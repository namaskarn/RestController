package com.shiva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="STOCK_PRICE")
@Data
public class StockPrice {
	@Id
	@Column(name="COMPANY_NAME")
	private Integer stockId;
	@Column(name="COMPANY_PRICE")
	private String companyName;
	@Column(name="COMPANY_PRICE")
	private Double companyPrice;
	public Double getCompanyPrice;

}

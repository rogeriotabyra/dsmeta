package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	public Sale() {
	}

	public Long getId() {
		return id;
	}

	
	public String getSellerName() {
		return sellerName;
	}

	
	public Integer getVisited() {
		return visited;
	}

	
	public Integer getDeals() {
		return deals;
	}

	
	public Double getAmount() {
		return amount;
	}

		
	public LocalDate getDate() {
		return date;
	}

	
}

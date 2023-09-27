package com.example.JavaMachineTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	@Column
	private String prodName;
	@Column
	private Float prodPrice;
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "catId" )
	private Category prodCategory;


	public Integer getProdId() {
		return prodId;
	}


	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public Float getProdPrice() {
		return prodPrice;
	}


	public void setProdPrice(Float prodPrice) {
		this.prodPrice = prodPrice;
	}


	public Category getProdCategory() {
		return prodCategory;
	}


	public void setProdCategory(Category prodCategory) {
		this.prodCategory = prodCategory;
	}
	

}

package com.example.toolshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class toolshop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "product_No")
	private String productno;
	
	@Column(name = "length")
	private String length;
	
	@Column(name = "std")
	private String std;
	
	@Column(name = "price_Blister")
	private String priceBlister;
	
	@Column(name = "price_Printerbag")
	private String pricePrinterdBag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductno() {
		return productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getPriceBlister() {
		return priceBlister;
	}

	public void setPriceBlister(String priceBlister) {
		this.priceBlister = priceBlister;
	}

	public String getPricePrinterdBag() {
		return pricePrinterdBag;
	}

	public void setPricePrinterdBag(String pricePrinterdBag) {
		this.pricePrinterdBag = pricePrinterdBag;
	}

	

}

package com.example.toolshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toolshop.Repository.productDetialsRepository;
import com.example.toolshop.model.productDetails;

@Service
public class productDetailImpl implements productDetailsService {
	@Autowired
	private productDetialsRepository productdetialsrepository;

	@Override
	public List<productDetails> getProductDetails() {
		return productdetialsrepository.findAll();
	
	}

}

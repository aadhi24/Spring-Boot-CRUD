package com.example.toolshop.Service;

import java.util.List;

import com.example.toolshop.model.toolshop;

public interface toolService  {
	List<toolshop> getAlltoolshop();
	void saveProduct(toolshop toolShop);
	toolshop gettoolshopById(Long id);
	void deleteProductById(long id);
	
	

}

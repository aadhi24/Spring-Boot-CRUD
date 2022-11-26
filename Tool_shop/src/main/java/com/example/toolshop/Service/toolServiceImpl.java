package com.example.toolshop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toolshop.Repository.toolRepository;
import com.example.toolshop.model.toolshop;

@Service
public class toolServiceImpl implements toolService{
	
	@Autowired
	private toolRepository toolrepository;

	@Override
	public List<toolshop> getAlltoolshop() {
		return toolrepository.findAll();
	}

	@Override
	public void saveProduct(toolshop toolShop) {
		this.toolrepository.save(toolShop);
		
	}

	@Override
	public toolshop gettoolshopById(Long id) {
		Optional<toolshop> optional = toolrepository.findById(id);
		toolshop toolshop= null;
		if(optional.isPresent()) {
			toolshop = optional.get();
			
		}else {
			throw new RuntimeException(" product not found for id :: " + id);
		}
		return toolshop;
	}

	@Override
	public void deleteProductById(long id) {
		this.toolrepository.deleteById(id);
		
	}

}

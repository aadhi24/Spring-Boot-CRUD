package com.example.toolshop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toolshop.Repository.CirclipPliperRepository;
import com.example.toolshop.model.CirclipPliper;
import com.example.toolshop.model.toolshop;


@Service
public class CirclipPliperServiceImpl implements CirclipPliperService {
	@Autowired
	private CirclipPliperRepository circlipPliperRepository;
	
	@Override
	public List<CirclipPliper> getAllCirclipPliper() {
		return circlipPliperRepository.findAll();
	}

	@Override
	public void saveCirclipPliper(CirclipPliper circlipPliper) {
		this.circlipPliperRepository.save(circlipPliper);
		
	}

	@Override
	public CirclipPliper getCirclipPliperById(Long id) {
		Optional<CirclipPliper> optional = circlipPliperRepository.findById(id);
		CirclipPliper circlipPliper = null;
		if(optional.isPresent()) {
			circlipPliper = optional.get();
		}
		else {
			throw new RuntimeException(" product not found for id :: " + id);
		}
		return circlipPliper;
	}

	@Override
	public void deleteCirclipPliperById(Long id) {
		this.circlipPliperRepository.deleteById(id);
		
	}

}
	

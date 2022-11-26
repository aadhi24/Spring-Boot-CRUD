package com.example.toolshop.Service;

import java.util.List;

import com.example.toolshop.model.CirclipPliper;

public interface CirclipPliperService {
	List<CirclipPliper> getAllCirclipPliper();
	void saveCirclipPliper(CirclipPliper circlipPliper);
	CirclipPliper getCirclipPliperById(Long id);
	void deleteCirclipPliperById(Long id);

}

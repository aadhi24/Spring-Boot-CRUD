package com.example.toolshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.toolshop.model.toolshop;

@Repository
public interface toolRepository extends JpaRepository<toolshop, Long>{

}

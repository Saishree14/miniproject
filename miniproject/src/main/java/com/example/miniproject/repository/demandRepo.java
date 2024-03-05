package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.miniproject.model.demandModel;

@Repository
public interface demandRepo extends JpaRepository<demandModel,Integer> {
    
}

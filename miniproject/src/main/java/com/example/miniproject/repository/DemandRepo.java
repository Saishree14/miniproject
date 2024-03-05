package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.miniproject.model.DemandModel;

import java.util.List;

@Repository
public interface DemandRepo extends JpaRepository<DemandModel,Integer> {
    List<DemandModel> findByCity(String city);
    List<DemandModel> findByManager(String manager);
}

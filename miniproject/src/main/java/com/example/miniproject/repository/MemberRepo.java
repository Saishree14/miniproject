package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.miniproject.model.MemberModel;

@Repository
public interface MemberRepo extends JpaRepository<MemberModel,Integer> {
    
}

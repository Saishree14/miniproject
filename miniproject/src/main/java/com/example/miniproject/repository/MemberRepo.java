package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.miniproject.model.MemberModel;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<MemberModel,Integer> {
     @Query(value="SELECT eid FROM(SELECT * FROM Skills WHERE skills=Java AND Maven")
     public List<Integer> findMember();
}

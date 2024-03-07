package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.miniproject.model.DemandModel;

import java.util.List;

@Repository
public interface DemandRepo extends JpaRepository<DemandModel,Integer> {

    @Query(value="SELECT * FROM demand WHERE city=:city",nativeQuery = true)
    List<DemandModel> findByCity(@Param("city")String city);
    @Query(value="SELECT * FROM demand WHERE level=:level",nativeQuery = true)
    List<DemandModel> findByLevel(@Param("level") String level);

    @Query(value="SELECT * FROM demand WHERE mgr_name=:mgr_name OR proj_name=:proj_name",nativeQuery = true)
    List<DemandModel>findByMgrorProj(@Param("mgr_name") String mgr_name,@Param("proj_name") String proj_name);

    @Query(value="SELECT * FROM demand WHERE demand_status=:status",nativeQuery = true)
    List<DemandModel> findByStatus(@Param("status") String status);

}

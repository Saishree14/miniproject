package com.example.miniproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="demand")
public class demandModel {
    
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dem_id;
    private String project_name;
    private String mgr_name;
    private String level;
    private String city;
    private String skills;
    private String status;
    private double duration;
    private String startDate;
    private String demand_status;
    
}

package com.example.miniproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="demand")
public class DemandModel {
    
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dem_id;
    private String projectname;
    private String manager;
    private String level;
    private String city;
    private String skills;
    private double duration;
    private String startDate;
    private String demand_status;
    
}

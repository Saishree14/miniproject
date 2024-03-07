package com.example.miniproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="demand")
public class DemandModel {
    
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dem_id;
    private String proj_name;
    private String mgr_name;
    private String level;
    private String city;
    private List<String> skills;
    private double duration;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date start_date;
    private String demand_status;
    
}

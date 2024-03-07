package com.example.miniproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@Table(name="member")
public class MemberModel {
    
    @jakarta.persistence.Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int eid;
    private String first_name;
    private String last_name;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date doj;
    private String level;
    private String location;
    private double overall_exp;
    private String member_status;

    @ElementCollection
    @CollectionTable(name="Skills",joinColumns = @JoinColumn(name="eid"))
    @Column(name="experience")
    @MapKeyColumn(name="skills")
    private Map<String,Integer> skills;
}
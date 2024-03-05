package com.example.miniproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="member")
public class MemberModel {
    
    @jakarta.persistence.Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    private int eid;
    private String first_name;
    private String last_name;
    private String doj;
    private String level;
    private String location;
    private double overall_exp;
    private String member_status;
    private String skills;
}
package com.example.miniproject.controller;


import com.example.miniproject.model.MemberModel;
import com.example.miniproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController // Declares the class as Controller Class
@RequestMapping("/member") // specifies the main path of API
public class MemberController {
    @Autowired // creates object of a class
    private MemberService memberservice;
    @PostMapping("/addMember") // API POST method sub-path
    public String addMethod(@RequestBody MemberModel MemberModelClass) {
        memberservice.createMember( MemberModelClass);
        return "Member added successfully!!";
    }

    @GetMapping("/getAll")
    public List<MemberModel> getAll() {
        return memberservice.getMembers();
    }
}

package com.example.miniproject.service;

import com.example.miniproject.model.MemberModel;
import com.example.miniproject.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService {
    @Autowired
    MemberRepo memberrepo;
    public void createMember(MemberModel memberModel){
        memberrepo.save(memberModel);
    }

    public List<MemberModel> getMembers() {
        return memberrepo.findAll();
    }

    public List<Integer>getMemberId(){
        return memberrepo.findMember();
    }
}

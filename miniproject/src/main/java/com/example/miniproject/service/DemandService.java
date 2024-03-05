package com.example.miniproject.service;

import com.example.miniproject.model.DemandModel;
import com.example.miniproject.repository.DemandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DemandService {
    @Autowired
    DemandRepo demandrepo;
    public void createDemand(DemandModel demandModel){
        demandrepo.save(demandModel);
    }

    public List<DemandModel> getDemands() {
        return demandrepo.findAll();
    }

    public List<DemandModel> getDemandsbyCity(String city){
        return demandrepo.findByCity(city);
    }

    public List<DemandModel> getDemandsbyManager(String manager){
       return demandrepo.findByManager(manager);
   }

}

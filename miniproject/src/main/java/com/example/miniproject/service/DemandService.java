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

    public List<DemandModel> getDemandsbyLevel(String level){
        return demandrepo.findByLevel(level);
   }

   public List<DemandModel> getDemandbyManagerorProject(String mgr_name,String proj_name){
        return demandrepo.findByMgrorProj(mgr_name,proj_name);
   }

   public List<DemandModel> getDemandByStatus(String status){
        return demandrepo.findByStatus(status);
   }

}

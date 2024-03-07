package com.example.miniproject.controller;

import com.example.miniproject.model.DemandModel;
import com.example.miniproject.service.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Declares the class as Controller Class
@RequestMapping("/demand") // specifies the main path of API
public class DemandController {
    @Autowired // creates object of a class
    private DemandService demandservice;
    @PostMapping("/addDemand") // API POST method sub-path
    public String addMethod(@RequestBody DemandModel demandModelClass) {
        demandservice.createDemand(demandModelClass);
        return "Demand added successfully!!";
    }

    @GetMapping("/getAll")
    public List<DemandModel> getAll() {
        return demandservice.getDemands();
    }

    @GetMapping("/getDemandByCity")
    public List<DemandModel> getDemandCity(@RequestParam String city) {
            return demandservice.getDemandsbyCity(city);
    }

    @GetMapping("/getDemandByLevel")
    public List<DemandModel> getDemandLevel(@RequestParam String level) {
        return demandservice.getDemandsbyLevel(level);
   }

   @GetMapping("/getDemandByMgrorProj")
    public List<DemandModel> getDemandMgrorProj(@RequestParam(required = false) String mgr_name,@RequestParam(required = false) String proj_name){
        return demandservice.getDemandbyManagerorProject(mgr_name,proj_name);
   }

   @GetMapping("/getDemandByStatus")
   public List<DemandModel> getDemandStatus(@RequestParam String status){
        return demandservice.getDemandByStatus(status);
   }
}

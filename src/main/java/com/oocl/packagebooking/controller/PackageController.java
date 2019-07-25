package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping("/packages")
    public List<ExpressPackage> getAllPackage(){
        return packageService.findAllPackage();
    }

    @PostMapping("/packages")
    public ExpressPackage addPackage(@RequestBody ExpressPackage expressPackage){
        return packageService.addPackage(expressPackage);
    }

    @PutMapping(value = "/packages",params = {"id","appointmentTime"})
    public ExpressPackage book(@RequestParam int id, @RequestParam long appointmentTime){
        return packageService.book(id,appointmentTime);
    }

}

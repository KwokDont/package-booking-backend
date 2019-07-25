package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}

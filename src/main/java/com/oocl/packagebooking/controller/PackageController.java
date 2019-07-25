package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

    @PutMapping(value = "/packages")
    public ExpressPackage book(@RequestBody ExpressPackage expressPackage){
        return packageService.book(expressPackage);
    }

    @GetMapping(value = "/packages",params = "status")
    public List<ExpressPackage> getPackagesByStatus(@RequestParam String status){
        return packageService.findPackagesByStatus(status);
    }

    @PutMapping(value = "/packages/{id}")
    public ExpressPackage takePackage(@PathVariable int id){
        return packageService.takePackage(id);
    }

}

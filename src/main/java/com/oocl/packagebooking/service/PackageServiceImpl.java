package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageRepository repository;

    @Override
    public List<ExpressPackage> findAllPackage() {
        return repository.findAll();
    }

    @Override
    public ExpressPackage addPackage(ExpressPackage pack) {
        return repository.save(pack);
    }

    @Override
    public ExpressPackage book(ExpressPackage pack) {
        Date date = new Date(pack.getAppointmentTime());
        if(date.getHours() > 9 && date.getHours() < 20){

        }
        return repository.save(pack);
    }

}

package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }
}

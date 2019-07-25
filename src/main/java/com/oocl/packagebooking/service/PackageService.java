package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.ExpressPackage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PackageService {

    List<ExpressPackage> findAllPackage();

    ExpressPackage addPackage(ExpressPackage pack);

    ExpressPackage book(ExpressPackage pack);
}

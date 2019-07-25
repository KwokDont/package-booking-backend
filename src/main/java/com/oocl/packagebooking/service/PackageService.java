package com.oocl.packagebooking.service;

import java.util.List;

public interface PackageService {

    List<Package> findAllPackage();

    Package addPackage(Package pack);
}

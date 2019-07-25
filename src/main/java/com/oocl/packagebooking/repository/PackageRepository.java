package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.ExpressPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<ExpressPackage, Integer> {
}

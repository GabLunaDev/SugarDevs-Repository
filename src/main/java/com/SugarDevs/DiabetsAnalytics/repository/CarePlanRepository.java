package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.CarePlan;

@Repository
public interface CarePlanRepository extends JpaRepository<CarePlan, Long>{
    
}

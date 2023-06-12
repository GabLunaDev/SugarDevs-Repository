package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.Nutricionist;

@Repository
public interface NutricionistRepository extends JpaRepository<Nutricionist, Long> {
    
}

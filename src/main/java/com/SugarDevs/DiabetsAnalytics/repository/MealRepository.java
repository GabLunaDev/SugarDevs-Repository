package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    
}

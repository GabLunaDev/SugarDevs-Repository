package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.CarePlan;

public interface CarePlanServiceInterface {
    List<CarePlan> findAllCarePlans();
    Optional<CarePlan> findById(Long id);
    CarePlan saveCarePlan(CarePlan carePlan);
    CarePlan updateCarePlan(CarePlan carePlan);
    void deleteCarePlan(Long id);
}

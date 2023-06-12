package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.CarePlan;
import com.SugarDevs.DiabetsAnalytics.repository.CarePlanRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.CarePlanServiceInterface;

@Service
public class CarePlanService implements CarePlanServiceInterface {
    private final CarePlanRepository CarePlanRepository;

    public CarePlanService(CarePlanRepository CarePlanRepository){
        this.CarePlanRepository = CarePlanRepository;
    }

    @Override
    public List<CarePlan> findAllCarePlans() {
        return CarePlanRepository.findAll();
    }

    @Override
    public Optional<CarePlan> findById(Long id) {
        return CarePlanRepository.findById(id);
    }

    @Override
    public CarePlan saveCarePlan(CarePlan CarePlan) {
        return CarePlanRepository.save(CarePlan);
    }

    @Override
    public CarePlan updateCarePlan(CarePlan CarePlan) {
        return CarePlanRepository.save(CarePlan);
    }

    @Override
    public void deleteCarePlan(Long id) {
        CarePlanRepository.deleteById(id);
    }
}

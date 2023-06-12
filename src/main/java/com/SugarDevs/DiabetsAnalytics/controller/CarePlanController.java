package com.SugarDevs.DiabetsAnalytics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SugarDevs.DiabetsAnalytics.models.CarePlan;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.CarePlanService;

@RestController
@ResponseBody
@RequestMapping("/care-plan")
public class CarePlanController {
    private final CarePlanService carePlanService;

    public CarePlanController(CarePlanService CarePlanService){
        this.carePlanService = CarePlanService;
    }

    @GetMapping
    public List<CarePlan> findAllCarePlans(){
        return carePlanService.findAllCarePlans();
    }

    @GetMapping("/{id}")
    public Optional<CarePlan> findCarePlanById(@PathVariable("id") Long id){
        return carePlanService.findById(id);
    }

    @PostMapping
    public CarePlan saveCarePlan(@RequestBody CarePlan carePlan){
        return carePlanService.saveCarePlan(carePlan);
    }

    @PutMapping("/{id}/update")
    public CarePlan updateCarePlan (@RequestBody CarePlan carePlan){
        return carePlanService.updateCarePlan(carePlan);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteCarePlan(@PathVariable Long id){
        carePlanService.deleteCarePlan(id);
    }    
}

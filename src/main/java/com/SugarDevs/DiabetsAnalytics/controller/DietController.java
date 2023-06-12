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

import com.SugarDevs.DiabetsAnalytics.models.Diet;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.DietService;

@RestController
@ResponseBody
@RequestMapping("/diet")
public class DietController {
        private final DietService dietService;

    public DietController(DietService dietService){
        this.dietService = dietService;
    }

    @GetMapping
    public List<Diet> findAllDiets(){
        return dietService.findAllDiets();
    }

    @GetMapping("/{id}")
    public Optional<Diet> findDietById(@PathVariable("id") Long id){
        return dietService.findById(id);
    }

    @PostMapping
    public Diet saveDiet(@RequestBody Diet diet){
        return dietService.saveDiet(diet);
    }

    @PutMapping("/{id}/update")
    public Diet updateDiet (@RequestBody Diet diet){
        return dietService.updateDiet(diet);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteDiet(@PathVariable Long id){
        dietService.deleteDiet(id);
    }
}

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

import com.SugarDevs.DiabetsAnalytics.models.Nutricionist;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.NutricionistService;

@RestController
@ResponseBody
@RequestMapping("/nutricionist")
public class NutricionistController {
        private final NutricionistService nutricionistService;

    public NutricionistController(NutricionistService nutricionistService){
        this.nutricionistService = nutricionistService;
    }

    @GetMapping
    public List<Nutricionist> findAllNutricionists(){
        return nutricionistService.findAllNutricionists();
    }

    @GetMapping("/{id}")
    public Optional<Nutricionist> findNutricionistById(@PathVariable("id") Long id){
        return nutricionistService.findById(id);
    }

    @PostMapping
    public Nutricionist saveNutricionist(@RequestBody Nutricionist nutricionist){
        return nutricionistService.saveNutricionist(nutricionist);
    }

    @PutMapping("/{id}/update")
    public Nutricionist updateNutricionist (@RequestBody Nutricionist nutricionist){
        return nutricionistService.updateNutricionist(nutricionist);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteNutricionist(@PathVariable Long id){
        nutricionistService.deleteNutricionist(id);
    }    
}

package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Nutricionist;

public interface NutricionistServiceInterface {
    List<Nutricionist> findAllNutricionists();
    Optional<Nutricionist> findById(Long id);
    Nutricionist saveNutricionist(Nutricionist nutricionist);
    Nutricionist updateNutricionist(Nutricionist nutricionist);
    void deleteNutricionist(Long id);
}

package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Nutricionist;
import com.SugarDevs.DiabetsAnalytics.repository.NutricionistRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.NutricionistServiceInterface;

@Service
public class NutricionistService implements NutricionistServiceInterface{
    private final NutricionistRepository nutricionistRepository;

    public NutricionistService(NutricionistRepository nutricionistRepository){
        this.nutricionistRepository = nutricionistRepository;
    }

    @Override
    public List<Nutricionist> findAllNutricionists() {
        return nutricionistRepository.findAll();
    }

    @Override
    public Optional<Nutricionist> findById(Long id) {
        return nutricionistRepository.findById(id);
    }

    @Override
    public Nutricionist saveNutricionist(Nutricionist nutricionist) {
        return nutricionistRepository.save(nutricionist);
    }

    @Override
    public Nutricionist updateNutricionist(Nutricionist nutricionist) {
        return nutricionistRepository.save(nutricionist);
    }

    @Override
    public void deleteNutricionist(Long id) {
        nutricionistRepository.deleteById(id);
    }
}

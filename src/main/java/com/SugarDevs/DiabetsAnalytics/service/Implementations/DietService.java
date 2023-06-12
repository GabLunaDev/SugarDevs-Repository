package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Diet;
import com.SugarDevs.DiabetsAnalytics.repository.DietRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.DietServiceInterface;

@Service
public class DietService implements DietServiceInterface {
    private final DietRepository dietRepository;

    public DietService(DietRepository DietRepository){
        this.dietRepository = DietRepository;
    }

    @Override
    public List<Diet> findAllDiets() {
        return dietRepository.findAll();
    }

    @Override
    public Optional<Diet> findById(Long id) {
        return dietRepository.findById(id);
    }

    @Override
    public Diet saveDiet(Diet Diet) {
        return dietRepository.save(Diet);
    }

    @Override
    public Diet updateDiet(Diet Diet) {
        return dietRepository.save(Diet);
    }

    @Override
    public void deleteDiet(Long id) {
        dietRepository.deleteById(id);
    }
}

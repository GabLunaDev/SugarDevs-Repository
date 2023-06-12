package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Glicosis;
import com.SugarDevs.DiabetsAnalytics.repository.GlicosisRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.GlicosisServiceInterface;

@Service
public class GlicosisService implements GlicosisServiceInterface{
    private final GlicosisRepository glicosisRepository;

    public GlicosisService(GlicosisRepository glicosisRepository){
        this.glicosisRepository = glicosisRepository;
    }

    @Override
    public List<Glicosis> findAllGlicosises() {
        return glicosisRepository.findAll();
    }

    @Override
    public Optional<Glicosis> findById(Long id) {
        return glicosisRepository.findById(id);
    }

    @Override
    public Glicosis saveGlicosis(Glicosis glicosis) {
        return glicosisRepository.save(glicosis);
    }

    @Override
    public Glicosis updateGlicosis(Glicosis glicosis) {
        return glicosisRepository.save(glicosis);
    }

    @Override
    public void deleteGlicosis(Long id) {
        glicosisRepository.deleteById(id);
    }
}

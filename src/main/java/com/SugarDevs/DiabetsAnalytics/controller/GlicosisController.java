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

import com.SugarDevs.DiabetsAnalytics.models.Glicosis;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.GlicosisService;

@RestController
@ResponseBody
@RequestMapping("/glicosis")
public class GlicosisController {
        private final GlicosisService glicosisService;

    public GlicosisController(GlicosisService glicosisService){
        this.glicosisService = glicosisService;
    }

    @GetMapping
    public List<Glicosis> findAllGlicosiss(){
        return glicosisService.findAllGlicosises();
    }

    @GetMapping("/{id}")
    public Optional<Glicosis> findGlicosisById(@PathVariable("id") Long id){
        return glicosisService.findById(id);
    }

    @PostMapping
    public Glicosis saveGlicosis(@RequestBody Glicosis glicosis){
        return glicosisService.saveGlicosis(glicosis);
    }

    @PutMapping("/{id}/update")
    public Glicosis updateGlicosis (@RequestBody Glicosis glicosis){
        return glicosisService.updateGlicosis(glicosis);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteGlicosis(@PathVariable Long id){
        glicosisService.deleteGlicosis(id);
    }
}

package com.exa_parcial.exa_parcial.web.controller;

import com.exa_parcial.exa_parcial.domain.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingController {

    private final EduSmartAIService aiService;

    public MarketingController(EduSmartAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/edusmart/publicidad")
    public String generarPublicidad(
            @RequestParam String tema,
            @RequestParam String audiencia
    ) {
        return aiService.generarPublicidad(tema, audiencia);
    }
}

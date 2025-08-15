package org.vekzz_dev.unit_converter.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vekzz_dev.unit_converter.models.TemperatureUnit;
import org.vekzz_dev.unit_converter.services.TemperatureService;

import java.util.EnumSet;

@Controller
@RequestMapping("/unit-converter")
public class TemperatureController {

    private final TemperatureService service;

    public TemperatureController(TemperatureService service) {
        this.service = service;
    }

    @GetMapping("/temperature")
    public String showTemperatureForm() {
        return "temperature";
    }

    @PostMapping("/temperature/submit")
    public String getDistance(@RequestParam String value, @RequestParam String from,
                              @RequestParam String to, Model model) {
        String result = service.convertTemperature(Double.parseDouble(value), from, to);
        model.addAttribute("result", result);
        return "temperature";
    }

    @ModelAttribute("temperatures")
    public EnumSet<TemperatureUnit> TemperatureUnitsModel() {
        return EnumSet.allOf(TemperatureUnit.class);
    }

    @ModelAttribute
    public void addActivePage(Model model, HttpServletRequest request) {
        String uri = request.getRequestURI();
        if (uri.contains("/distance")) {
            model.addAttribute("activePage", "distance");
        } else if (uri.contains("/weight")) {
            model.addAttribute("activePage", "weight");
        } else if (uri.contains("/temperature")) {
            model.addAttribute("activePage", "temperature");
        }
    }
}

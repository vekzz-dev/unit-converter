package org.vekzz_dev.unit_converter.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vekzz_dev.unit_converter.models.WeightUnit;
import org.vekzz_dev.unit_converter.services.WeightService;

import java.util.EnumSet;

@Controller
@RequestMapping("/unit-converter")
public class WeightController {

    private final WeightService service;

    public WeightController(WeightService service) {
        this.service = service;
    }

    @GetMapping("/weight")
    public String showWeightForm() {
        return "weight";
    }

    @PostMapping("/weight/submit")
    public String getDistance(@RequestParam String value, @RequestParam String from,
                              @RequestParam String to, Model model) {
        String result = service.convertWeight(Double.parseDouble(value), from, to);
        model.addAttribute("result", result);
        return "weight";
    }

    @ModelAttribute("weights")
    public EnumSet<WeightUnit> WeightUnitsModel() {
        return EnumSet.allOf(WeightUnit.class);
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

package org.vekzz_dev.unit_converter.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vekzz_dev.unit_converter.models.DistanceUnit;
import org.vekzz_dev.unit_converter.services.DistanceService;

import java.util.EnumSet;

@Controller
@RequestMapping("/unit-converter")
public class DistanceController {

    private final DistanceService service;

    public DistanceController(DistanceService service) {
        this.service = service;
    }

    @GetMapping("/distance")
    public String showDistanceForm() {
        return "distance";
    }

    @PostMapping("/distance/submit")
    public String getDistance(@RequestParam String value, @RequestParam String from,
                              @RequestParam String to, Model model) {
        String result = service.convertDistance(Double.parseDouble(value), from, to);
        model.addAttribute("result", result);
        return "distance";
    }

    @ModelAttribute("distances")
    public EnumSet<DistanceUnit> distanceUnitsModel() {
        return EnumSet.allOf(DistanceUnit.class);
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

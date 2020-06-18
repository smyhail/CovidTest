package com.aub.CovidTest.controller;


import com.aub.CovidTest.entities.Persons;
import com.aub.CovidTest.repositories.CovidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Controller
public class CovidController {

    @Autowired
    private CovidRepository covidRepository;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("data", covidRepository.findAll(  PageRequest.of(page, 4)  ));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model) {
       Map<String, Integer> surveyMap = new LinkedHashMap<>();
        surveyMap.put("Java", 40);
        surveyMap.put("Dev oops", 25);
        surveyMap.put("Python", 20);
        surveyMap.put(".Net", 15);
        model.addAttribute("surveyMap", surveyMap);
        return "barGraph";
    }

    @GetMapping("/displayPieChart")
    public String pieChart(Model model) {
        model.addAttribute("pass", 50);
        model.addAttribute("fail", 50);
        return "pieChart";
    }


    @PostMapping("/save")
    public String save(Persons c){
        covidRepository.save( c );
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCountry(Integer id){
        covidRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Persons> findOne(Integer id){
        return covidRepository.findById( id);

    }

}

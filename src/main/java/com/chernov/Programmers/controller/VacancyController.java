package com.chernov.Programmers.controller;


import com.chernov.Programmers.entity.Vacancies;
import com.chernov.Programmers.entity.Vacancy;
import com.chernov.Programmers.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vacancies")
public class VacancyController {

    private final VacancyService vacancyService;

    @Autowired
    public VacancyController(VacancyService vacancyService) {this.vacancyService = vacancyService;}

    @GetMapping
    public ResponseEntity getAllVacancies() {
        return ResponseEntity.ok(vacancyService.getAllVacancies().getItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity getVacancyById(@PathVariable String id) {
        return ResponseEntity.ok(vacancyService.getVacancyById(id));
    }

}

package com.chernov.Programmers.service;


import com.chernov.Programmers.entity.Vacancies;
import com.chernov.Programmers.entity.Vacancy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Service
public class VacancyService {
    private RestTemplate restTemplate = new RestTemplate();
    private static final String hhApi = "https://api.hh.ru/vacancies";

    public Vacancies getAllVacancies(){
        return restTemplate.getForEntity(hhApi, Vacancies.class).getBody();
    }

    public Vacancy getVacancyById(String id){
        return restTemplate.getForEntity(hhApi + "/" + id, Vacancy.class).getBody();
    }

}

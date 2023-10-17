package com.microservices.doctor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    public String getName(String name){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9000/search/" + name,String.class);
    }

}

package com.microservices.patient.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    List<String> names= Arrays.asList("Mohammed","Rabia","Khalid");

    public String getName(String name){
        return names.stream().filter(n -> n.equals(name)).findAny().orElse("No Patient Found");
    }

}

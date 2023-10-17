package com.microservices.doctor.controller;

import com.microservices.doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @GetMapping("/doctor/get-patient/{name}")
    public String getPatientName(@PathVariable String name){
        return this.patientService.getName(name);
    }
}

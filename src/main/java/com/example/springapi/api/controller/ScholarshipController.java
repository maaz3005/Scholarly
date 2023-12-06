package com.example.springapi.api.controller;

import com.example.springapi.api.model.Scholarship;
import com.example.springapi.service.ScholarshipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin
public class ScholarshipController {
    public ScholarshipService scholarshipService;

    public ScholarshipController(ScholarshipService scholarshipService) {
        this.scholarshipService = scholarshipService;
    }

    @GetMapping("/scholarships/{id}")
    public Scholarship getScholarship(@RequestParam Integer id) {
        return scholarshipService.getScholarship(id);
    }

    @GetMapping("/scholarships")
    public List<Scholarship> getAllScholarships() {
        try {
            return scholarshipService.getAllScholarships();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

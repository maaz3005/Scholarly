package com.example.springapi.api.model;

import java.util.Date;

public class Scholarship {
    private int id;
    private String name;
    private String scholarshipProvider;
    private String state;
    private int amount;
    private Date applicationDeadline;
    private String description;
    private String scholarshipDuration;
    private int needsEssay;

    public Scholarship() {
    }

    public int getId() {
        return id;
    }
    public  void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public String getScholarshipProvider() {
        return scholarshipProvider;
    }
    public  void setScholarshipProvider(String scholarshipProvider) {
        this.scholarshipProvider = scholarshipProvider;
    }
    public String getState() {
        return state;
    }
    public  void setState(String state) {
        this.state = state;
    }
    public int getAmount() {
        return amount;
    }
    public  void setAmount(int amount) {
        this.amount = amount;
    }
    public Date getApplicationDeadline() {
        return applicationDeadline;
    }
    public  void setApplicationDeadline(Date applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }
    public String getDescription() {
        return description;
    }
    public  void setDescription(String description) {
        this.description = description;
    }
    public String getScholarshipDuration() {
        return scholarshipDuration;
    }
    public  void setScholarshipDuration(String scholarshipDuration) {
        this.scholarshipDuration = scholarshipDuration;
    }
    public int getNeedsEssay() {
        return needsEssay;
    }
    public  void setNeedsEssay(int needsEssay) {
        this.needsEssay = needsEssay;
    }
}

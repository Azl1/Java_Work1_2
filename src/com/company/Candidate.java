package com.company;

import java.util.Scanner;

public class Candidate {

    String name;
    String genderOfAPerson;
    String age;
    int resumeRelevance;
    int assessment;

    public Candidate(String name, String genderOfAPerson, String age, int resumeRelevance, int assessment) {
        this.name = name;
        this.genderOfAPerson = genderOfAPerson;
        this.age = age;
        this.resumeRelevance = resumeRelevance;
        this.assessment = assessment;
    }

    public Candidate(int resumeRelevance, int assessment) {
        this.resumeRelevance = resumeRelevance;
        this.assessment = assessment;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenderOfAPerson() {
        return genderOfAPerson;
    }
    public void setGenderOfAPerson(String genderOfAPerson) {
        this.genderOfAPerson = genderOfAPerson;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public int getResumeRelevance() {
        return resumeRelevance;
    }
    public void setResumeRelevance(int resumeRelevance) {
        this.resumeRelevance = resumeRelevance;
    }

    public int getAssessment() {
        return assessment;
    }
    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", genderOfAPerson='" + genderOfAPerson + '\'' +
                ", age=" + age +
                ", resumeRelevance=" + resumeRelevance +
                ", assessment=" + assessment +
                '}';
    }
}

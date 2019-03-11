package com.abroad.abroad.bean;

import javax.persistence.*;

/*
大学
 */
@Entity
@Table(name = "college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double tuition;
    private double toeflGrades;
    private double satGrades;
    private int rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getToeflGrades() {
        return toeflGrades;
    }

    public void setToeflGrades(double toeflGrades) {
        this.toeflGrades = toeflGrades;
    }

    public double getSatGrades() {
        return satGrades;
    }

    public void setSatGrades(double satGrades) {
        this.satGrades = satGrades;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}


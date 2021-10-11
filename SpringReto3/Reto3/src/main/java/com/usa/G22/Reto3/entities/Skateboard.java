package com.usa.G22.Reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "skateboard")
public class Skateboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSkateboard;
    private String name;
    private Integer year;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("category")
    private Category category;

    public Integer getIdSkateboard() {
        return idSkateboard;
    }

    public void setIdSkateboard(Integer idSkateboard) {
        this.idSkateboard = idSkateboard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

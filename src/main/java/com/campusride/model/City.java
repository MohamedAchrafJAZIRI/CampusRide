package com.campusride.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class City extends BaseEntity {

    @NotBlank(message = "name is required")
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

package com.campusride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Car extends BaseEntity {

    @NotBlank(message = "model is required")
    private String model;

    @NotBlank(message = "plate is required")
    private String plate;

    @ManyToOne
    private Student owner;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getPlate() { return plate; }
    public void setPlate(String plate) { this.plate = plate; }

    public Student getOwner() { return owner; }
    public void setOwner(Student owner) { this.owner = owner; }
}

package com.campusride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Review extends BaseEntity {

    @Min(value = 1, message = "rating min is 1")
    @Max(value = 5, message = "rating max is 5")
    private int rating;

    private String comment;

    @ManyToOne
    @NotNull(message = "trip is required")
    private Trip trip;

    @ManyToOne
    @NotNull(message = "author is required")
    private Student author;

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Trip getTrip() { return trip; }
    public void setTrip(Trip trip) { this.trip = trip; }

    public Student getAuthor() { return author; }
    public void setAuthor(Student author) { this.author = author; }
}

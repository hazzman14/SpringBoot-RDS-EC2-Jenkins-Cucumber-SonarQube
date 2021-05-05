package com.harry.demo.film;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film {
    @Id
    @GeneratedValue
    private Long film_id;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "rental_duration")
    private int rentalDuration;
    @Column(name = "rental_rate")
    private long rentalRate;
    @Column(name = "length")
    private int length;
    @Column(name = "replacement_cost")
    private long replacementCost;
    @Column(name = "rating")
    private String rating;
    @Column(name = "special_features")
    private String specialFeatures;

    public Film() {
    }

    public Film(String title, String description, int rentalDuration, long rentalRate, int length, long replacementCost, String rating, String specialFeatures) {
        this.title = title;
        this.description = description;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
    }

    public Long getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Long film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public long getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(long rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(long replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}

package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor
//@AllArgsConstructor
//@Data

public class BoxFilm {
    private int id;
    private String filmName;
    private int year;

    public BoxFilm(int id, String filmName, int year) {
        this.id = id;
        this.filmName = filmName;
        this.year = year;
    }
}





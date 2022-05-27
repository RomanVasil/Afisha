package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor
//@AllArgsConstructor
@Data

public class BoxFilm {
    private int id;
    private String filmName;
    private int year;

    public BoxFilm(int id, String filmName, int year) {
        this.id = id;
        this.filmName = filmName;
        this.year = year;
    }

//    public int getId() {
//        return this.id;
//    }
//
//    public String getFilmName() {
//        return this.filmName;
//    }
//
//    public int getYear() {
//        return this.year;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setFilmName(String filmName) {
//        this.filmName = filmName;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
}





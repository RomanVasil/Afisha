package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PosterManagerTest {
    private PosterManager manager1 = new PosterManager(5);
    private PosterManager manager = new PosterManager();
    private BoxFilm boxFilm1 = new BoxFilm(1, "Test", 2022);
    private BoxFilm boxFilm2 = new BoxFilm(2, "Test", 2022);
    private BoxFilm boxFilm3 = new BoxFilm(3, "Test", 2022);
    private BoxFilm boxFilm4 = new BoxFilm(4, "Test", 2022);
    private BoxFilm boxFilm5 = new BoxFilm(5, "Test", 2022);
    private BoxFilm boxFilm6 = new BoxFilm(6, "Test", 2022);
    private BoxFilm boxFilm7 = new BoxFilm(7, "Test", 2022);
    private BoxFilm boxFilm8 = new BoxFilm(8, "Test", 2022);
    private BoxFilm boxFilm9 = new BoxFilm(9, "Test", 2022);
    private BoxFilm boxFilm10 = new BoxFilm(10, "Test", 2022);

    @Test
    public void findLast() {
        manager1.add(boxFilm1);
        manager1.add(boxFilm2);
        manager1.add(boxFilm3);
        manager1.add(boxFilm4);
        manager1.add(boxFilm5);

        BoxFilm[] expected = {boxFilm5, boxFilm4, boxFilm3, boxFilm2, boxFilm1};
        BoxFilm[] actual = manager1.findLast();
       // System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        manager.add(boxFilm1);
        manager.add(boxFilm2);
        manager.add(boxFilm3);
        manager.add(boxFilm4);
        manager.add(boxFilm5);
        manager.add(boxFilm6);
        manager.add(boxFilm7);
        manager.add(boxFilm8);
        manager.add(boxFilm9);
        manager.add(boxFilm10);


        BoxFilm[] expected = {boxFilm1, boxFilm2, boxFilm3, boxFilm4, boxFilm5, boxFilm6, boxFilm7, boxFilm8, boxFilm9, boxFilm10};
        BoxFilm[] actual = manager.findAll();
       // System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    public void add() {
        manager.add(boxFilm1);
        manager.add(boxFilm2);
        manager.add(boxFilm3);
        manager.add(boxFilm4);
        manager.add(boxFilm5);
        manager.add(boxFilm6);
        manager.add(boxFilm7);
        manager.add(boxFilm8);
        manager.add(boxFilm9);
        manager.add(boxFilm10);

        BoxFilm[] actual = manager.findAll();
        BoxFilm[] expected = {boxFilm1, boxFilm2, boxFilm3, boxFilm4, boxFilm5, boxFilm6, boxFilm7, boxFilm8, boxFilm9, boxFilm10};
        assertArrayEquals(actual, expected);
    }
}



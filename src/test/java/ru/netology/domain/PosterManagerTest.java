package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    public PosterManager manager = new PosterManager();
    public PosterManager manager1 = new PosterManager(5);

    @Test
    public void findLast() {
        for (int i = 0; i < 10; i++) {
            manager1.add(new BoxFilm(i, " Test " + i, 2022 - i));
        }

        BoxFilm[] actual = manager1.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(5, actual.length);
    }

    @Test
    public void findAll() {
        for (int i = 0; i < 10; i++) {
            manager.add(new BoxFilm(i, " Test " + i, 2022 - i));
        }

        BoxFilm[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        assertEquals(10, actual.length);
    }

    @Test
    public void add() {
        BoxFilm[] actual = manager.findAll();
        BoxFilm[] expected = new BoxFilm[];
        assertArrayEquals();
    }
}



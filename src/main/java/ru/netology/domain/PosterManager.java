package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor

public class PosterManager {
    private BoxFilm[] items = new BoxFilm[0];
    private int lastMaxCount = 10;

    public PosterManager() {
    }

    public PosterManager(int lastMaxCount) {
        this.lastMaxCount = lastMaxCount;
    }

    public void add(BoxFilm item) {
        BoxFilm[] tmp = new BoxFilm[this.items.length + 1];
        System.arraycopy(this.items, 0, tmp, 0, this.items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }

    public BoxFilm[] findAll() {
        return this.items;
    }

    public BoxFilm[] findLast() {
        int resultLength;
        if (lastMaxCount >= 10) {
            resultLength = 10;
        } else {
            resultLength = Math.min(items.length, lastMaxCount);
        }

        BoxFilm[] result = new BoxFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = this.items[this.items.length - 1 - i];
        }
        return result;
    }
}

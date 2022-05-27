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
//        int resultLength = Math.min(items.length, lastMaxCount);
//        BoxFilm[] result = new BoxFilm[resultLength];
//        for (int i = 0; i < result.length; i++) {
//            int index = items.length - i - 1;
//            result[i] = items[index];
//            return this.items;
//        }
        return this.items;
    }

    public BoxFilm[] findLast() {
        int resultLength = Math.min(items.length, lastMaxCount);
        BoxFilm[] result = new BoxFilm[resultLength];
        for (int i = 0; i < this.lastMaxCount; i++) {
            result[i] = this.items[this.items.length - 1 - i];
        }
        // System.arraycopy(this.items, 0, result, 0, 1);

        return result;
    }
}

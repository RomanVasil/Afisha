package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PosterManager {
    private BoxFilm[] items = new BoxFilm[0];
    private int lastMaxCount = 10;

    public PosterManager(int lastMaxCount) {
        this.lastMaxCount = lastMaxCount;
    }

    public void add(BoxFilm item) {
        BoxFilm[] tmp = new BoxFilm[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }


    public BoxFilm[] findAll() {
        int resultLength = Math.min(items.length, lastMaxCount);
        BoxFilm[] result = new BoxFilm[resultLength];

        for (int i = 0; i < result.length; i++) {
            return this.items;
        }
        return result;
    }

    public BoxFilm[] findLast() {

        int resultLength = Math.min(items.length, lastMaxCount);
        BoxFilm[] result = new BoxFilm[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;

    }
}

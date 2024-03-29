package ru.gb.models;

import lombok.Data;

@Data
public class Reader {
    private static long idCounter = 1L;

    private final long id;
    private final String name;

    public Reader(String name) {
        this.id = idCounter++;
        this.name = name;
    }
}
package com.workintech.fswebs17d1.entity;

import org.springframework.stereotype.Component;

public class Animal {
    private Integer id;
    private String name;

    public Animal(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

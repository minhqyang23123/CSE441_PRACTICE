package com.example.bai13_03;

public class Phone {
    private String name;
    private int imageResource;

    public Phone(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}
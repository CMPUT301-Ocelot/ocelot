package com.example.ocelot;

public abstract class Shape {
    protected int x;
    protected int y;
    String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

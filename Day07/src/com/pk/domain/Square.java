package com.pk.domain;

public class Square {
    private double side;


    //获取周长
    public double getPerimeter() {
        return side * 4;
    }

    //获取面积
    public double getArea() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }
    public Square() {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

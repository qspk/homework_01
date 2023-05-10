package com.pk.domain;

public class Rectangle {
    private double width;  //矩形的宽

    private double height;  //矩形的高

    //获取矩形的周长
    public double getPerimeter() {
        return (width + height)*2;
    }

    //获取矩形的面积
    public double getArea() {
        return width * height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

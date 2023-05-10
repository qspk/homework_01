package com.pk.domain;

public class Circle {
    private double r;


    //获取圆的周长
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    //获取圆的面积
    public double getArea() {
        return 3.14 * r * r;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    /**
     * 获取
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * 设置
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    public String toString() {
        return "Rectangle{r = " + r + "}";
    }
}

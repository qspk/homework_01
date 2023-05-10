package com.pk.main;

import com.pk.domain.Square;

public class Day07_1_2 {
    public static void main(String[] args) {
        Square s1 = new Square(3);
        System.out.println(s1.getPerimeter()); //周长 12
        System.out.println(s1.getArea());      //面积 9

        Square s2 = new Square();
        s2.setSide(6);
        System.out.println(s2.getPerimeter());  //周长 24
        System.out.println(s2.getArea());       //面积36
    }
}

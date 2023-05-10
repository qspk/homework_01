package com.pk.main;

import com.pk.domain.Square;

public class Day07_1_2 {
    public static void main(String[] args) {
        Square s1 = new Square(3);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());

        Square s2 = new Square();
        s2.setSide(6);
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getArea());
    }
}

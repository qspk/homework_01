package com.pk.domain;

public class GeometryOperator {
    Square square;
    Rectangle rectangle;
    Circle circle;

    public GeometryOperator(Square square) {
        this.square = square;
        System.out.println("正方形周长是: " + (square.getSide() * 4));
        System.out.println("正方形面积是: " + (square.getSide() * square.getSide()));
    }

    public GeometryOperator(Rectangle rectangle) {
        this.rectangle = rectangle;
        System.out.println("长方形周长是: " + ((rectangle.getWidth() + rectangle.getWidth()) * 2));
        System.out.println("长方形面积是: " + (rectangle.getWidth() * rectangle.getHeight()));

    }

    public GeometryOperator(Circle circle) {
        this.circle = circle;
        System.out.printf("圆形周长是: %.4f", (circle.getR() * 3.14 * 2));
        System.out.println();
        System.out.printf("圆形面积是: %.4f", (circle.getR() * circle.getR() * 3.14));

    }

}

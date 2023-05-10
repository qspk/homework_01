package com.pk.main;

import com.pk.domain.Circle;
import com.pk.domain.GeometryOperator;
import com.pk.domain.Rectangle;
import com.pk.domain.Square;

import java.util.Scanner;

public class Day07_1_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请选择您要选择的图形:");
        System.out.println("0: 正方形  1: 长方形  2: 圆形");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("请输入正方形边长:");
                /*Square square = new Square(sc.nextDouble());
                new GeometryOperator(square);*/
                new GeometryOperator(new Square(sc.nextDouble()));
                break;
            case 1:
                System.out.println("请输入长方形的高:");
                double height = sc.nextDouble();
                System.out.println("请输入长方形的宽:");
                double width = sc.nextDouble();
//                Rectangle rectangle = new Rectangle(width, height);
                new GeometryOperator(new Rectangle(width,height));
                break;
            case 2:
                System.out.println("请输入圆形的半径:");
//                Circle circle = new Circle(sc.nextDouble());
                new GeometryOperator(new Circle(sc.nextDouble()));
                break;
            default:
                System.out.println("输入选项有误");
        }


    }
        /*switch (choice) {
            case 0:
                squareOperation();
                break;
            case 1:
                rectangleOperation();
                break;
            case 2:
                circleOperation();
                break;
            default:
                System.out.println("输入有误");
        }
    }


    //对圆形操作
    private static void circleOperation() {
        System.out.println("请输入圆的半径:");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.printf("圆的周长是: %.4f",c.getPerimeter());
        System.out.println();
        System.out.printf("圆的面积是: %.4f",c.getArea());
    }

    //对矩形操作
    private static void rectangleOperation() {
        System.out.println("请输入长方形的宽:");
        double width = sc.nextDouble();
        System.out.println("请输入长方形的高:");
        double height = sc.nextDouble();
        Rectangle rt = new Rectangle(width, height);
        System.out.println("长方形的周长是:"+rt.getPerimeter());
        System.out.println("长方形的面积是:"+rt.getArea());
    }

    //对正方形操作
    private static void squareOperation() {
        System.out.println("请输入正方形的边长:");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("正方形的周长是:"+s.getPerimeter());
        System.out.println("正方形的面积是:"+s.getArea());
    }*/
}

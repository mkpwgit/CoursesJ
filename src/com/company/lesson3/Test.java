package com.company.lesson3;

/**
 * @author kisel.nikolay@gmail.com
 * @since 29.09.2014
 */
public class Test {

    public static void main(String[] args) {
        Point[] points = new Point[5];
        for (int i = 0; i < 5; i++) {
            points[i] = new Point(i, i * 2);
            System.out.println(points[i].x + " " + points[i].y);
        }
    }
}

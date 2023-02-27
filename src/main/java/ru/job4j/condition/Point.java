package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double firstHalf = x2 - x1;
        double secondHalf = y2 - y1;
        return Math.sqrt(Math.pow(firstHalf, 2) + Math.pow(secondHalf, 2));

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 0) to (4, 0) " + distance(1, 0, 4, 0));
        System.out.println("result (4, 7) to (5, 2) " + distance(4, 7, 5, 2));
    }
}

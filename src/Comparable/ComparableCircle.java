package Comparable;

import java.util.Arrays;

public class ComparableCircle extends Circle  implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else  if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle("red", true, 1);
        circles[1] = new ComparableCircle("red", true, 6);
        circles[2] = new ComparableCircle("blue", true, 4);
        circles[3] = new ComparableCircle("green", true, 2);
        circles[4] = new ComparableCircle();

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}

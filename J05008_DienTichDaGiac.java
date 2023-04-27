/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Point {
    private double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    
    public static double getArea(Point p1, Point p2, Point p3) {
        double x = Point.distance(p1, p2);
        double y = Point.distance(p2, p3);
        double z = Point.distance(p1, p3);
        double p = (x + y + z) / 2;
        return (double) Math.sqrt(p * (p - x) * (p - z) * (p - y));
    }
    
    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class J05008_DienTichDaGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t--> 0) {
            int n = Integer.parseInt(in.nextLine());
            ArrayList<Point> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arr.add(new Point(Double.parseDouble(in.next()), Double.parseDouble(in.nextLine())));
            }
            double res = 0;
            for(int i = 0; i < n - 1; i++) {
                res += Point.getArea(arr.get(0), arr.get(i), arr.get(i + 1));
            }
            System.out.printf("%.3f\n", res);
        }
    }
}
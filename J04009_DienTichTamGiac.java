/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Point1 {
    private double x, y;
    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point1 p) {
        return Math.sqrt((this.x - p.getX()) * (this.x - p.getX()) + (this.y - p.getY()) * (this.y - p.getY()));
    }
    public static double area(double a, double b, double c) {
        double res = (a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c);
        res = Math.sqrt(res);
        return res / 4;
    }
}

public class J04009_DienTichTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            Point1 a = new Point1(in.nextDouble(), in.nextDouble());
            Point1 b = new Point1(in.nextDouble(), in.nextDouble());
            Point1 c = new Point1(in.nextDouble(), in.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = c.distance(a);
            if(ab + bc <= ac || ab + ac <= bc || bc + ac <= ab) {
                System.out.println("INVALID");
            }
            else {
                System.out.println(String.format("%.2f", Point1.area(ac, bc, ac)));
            }
        }
    }
}

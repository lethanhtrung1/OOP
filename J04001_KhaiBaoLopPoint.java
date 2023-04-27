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
class Point2 {
    double x, y;
    void input(Scanner in) {
        this.x = in.nextDouble();
        this.y = in.nextDouble();
    }
    double distance(Point2 p) {
        double a = this.x - p.x;
        double b = this.y - p.y;
        return Math.sqrt(a * a + b * b);
    }
}

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            Point2 p1 = new Point2();
            Point2 p2 = new Point2();
            p1.input(in);
            p2.input(in);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }    
}

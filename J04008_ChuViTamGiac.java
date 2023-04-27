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

class Point {
    double x, y;
    void input(Scanner in) {
        x = in.nextDouble();
        y = in.nextDouble();
    }
    double distance(Point a) {
        double X = this.x - a.x;
        double Y = this.y - a.y;
        return Math.sqrt(X * X + Y * Y);
    }
    double check(Point a, Point b) {
        double edge1 = this.distance(a);
        double edge2 = this.distance(b);
        double edge3 = a.distance(b);
        if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
            return edge1 + edge2 + edge3;
        return -1;
    }
}

public class J04008_ChuViTamGiac {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            a.input(in); b.input(in); c.input(in);
            if(a.check(b, c) == -1) {
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f\n", a.check(b, c));
            }
        }
    }
}

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

class Point3 {
    private double x, y;
    public Point3(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point3 p) {
        return Math.sqrt((this.x - p.getX()) * (this.x - p.getX()) + (this.y - p.getY()) * (this.y - p.getY()));
    }
}

public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            Point3 a = new Point3(in.nextDouble(), in.nextDouble());
            Point3 b = new Point3(in.nextDouble(), in.nextDouble());
            Point3 c = new Point3(in.nextDouble(), in.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = c.distance(a);
            if(ab + bc <= ac || ab + ac <= bc || bc + ac <= ab) {
                System.out.println("INVALID");
            }
            else {
                 double r = (ab * ac * bc) / Math.sqrt((ab + bc + ac) * (ab + bc - ac) * (ab - bc + ac) * (-ab + bc + ac));
                 System.out.printf("%.3f\n", Math.PI * r * r);
            }
        }
    }
}

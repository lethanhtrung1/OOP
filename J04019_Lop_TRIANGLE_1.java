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

class Point9 {
    private double x, y;
    public Point9(Point9 a) {
	this.x = a.getX();
	this.y = a.getY();
    }
    public Point9(double x, double y) {
	this.x = x;
	this.y = y;
    }
    public double getX() {
    	return x;
    }
    public double getY() {
	return y;
    }
    public static Point9 nextPoint(Scanner sc) {
	Point9 a = new Point9(sc.nextDouble(), sc.nextDouble());
    	return a;
    }
}

class Triangle {
    private Point9 a = new Point9(0, 0), b = new Point9(0, 0), c = new Point9(0, 0);
    public Triangle(Point9 a, Point9 b, Point9 c) {
    	super();
	this.a = new Point9(a);
	this.b = new Point9(b);
	this.c = new Point9(c);
    }
    public static double getDistance(Point9 a, Point9 b) {
       	return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }
    public boolean valid() {
        if((getDistance(a, b) + getDistance(a, c) <= getDistance(b, c) || (getDistance(c, b) + getDistance(a, c) <= getDistance(b, a)) || (getDistance(a, b) + getDistance(b, c) <= getDistance(a, c))))
            return false;
        return true;
	}
    public String getPerimeter() {
        return String.format("%.3f", getDistance(a, b) + getDistance(b, c) + getDistance(a, c));
    }
}

public class J04019_Lop_TRIANGLE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point9.nextPoint(sc), Point9.nextPoint(sc), Point9.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

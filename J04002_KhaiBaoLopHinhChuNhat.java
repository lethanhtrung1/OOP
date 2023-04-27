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

class Rectange {
    double width, height;
    String color;
    void input(Scanner in) {
        this.width = in.nextDouble();
        this.height = in.nextDouble();
        String s = in.next();
        this.color = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    double findArea() {
        return width * height;
    }
    double findPerimeter() {
        return 2 * (width + height);
    }
    boolean check() {
        if(this.width <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }
    void output() {
        if(this.check() == true) {
            System.out.printf("%d %d %s", (int)this.findPerimeter(), (int)this.findArea(), this.color);
        }
    }
}

public class J04002_KhaiBaoLopHinhChuNhat {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        Rectange r = new Rectange();
        r.input(in);
        r.output();
    }   
}

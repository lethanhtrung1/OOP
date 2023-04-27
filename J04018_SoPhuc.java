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

class ComplexNumber {
    private int real, image;
    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber c = new ComplexNumber(a.real + b.real, a.image + b.image);
        return c;
    }
    public static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        ComplexNumber c = new ComplexNumber(0, 0);
        c.real = a.real * b.real - (a.image * b.image);
        c.image = a.real * b.image + a.image * b.real;
        return c;
    }
    @Override
    public String toString() {
//        return real + " + " + image + "i";
        if(image < 0)
            return real + " - " + Math.abs(image) + "i";
        return real + " + " + image + "i";
    }
}

public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            ComplexNumber a = new ComplexNumber(in.nextInt(), in.nextInt());
            ComplexNumber b = new ComplexNumber(in.nextInt(), in.nextInt());
            ComplexNumber c = ComplexNumber.add(a, b);
            ComplexNumber res1 = ComplexNumber.mul(c, a);
            ComplexNumber res2 = ComplexNumber.mul(c, c);
            System.out.println(res1 + ", " + res2);
        }
    }
}

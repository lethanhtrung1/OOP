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

class Fraction {
    long numerator, denominator;
    void input(Scanner in) {
        numerator = in.nextLong();
        denominator = in.nextLong();
    }
    void reduceFraction() {
        long x = numerator;
        long y = denominator;
        while(y > 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        numerator /= x;
        denominator /= x;
    }
    Fraction add(Fraction b) {
        Fraction c = new Fraction();       
        c.numerator = numerator * b.denominator + b.numerator * denominator;
        c.denominator = denominator * b.denominator;
        c.reduceFraction();
        return c;
    }
    void output() {
        System.out.print(numerator + "/" + denominator);
    }
}

public class J04004_TongPhanSo {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.input(in);
        b.input(in);
        Fraction res = a.add(b);
        res.output();
    }    
}

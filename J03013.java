/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J03013 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger sub = a.subtract(b);
            sub = sub.abs();
            String s = sub.toString();
            String x = a.toString();
            String y = b.toString();
            if(s.length() < Math.max(x.length(), y.length())) {
                System.out.println("0" + sub);
            }
            else {
                System.out.println(sub);
            }
        }
    }
}

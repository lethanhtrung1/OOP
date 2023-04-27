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
public class J02008 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long n = in.nextLong();
            long res =  1;
            for(long i = 1; i <= n; i++) {
                res = lcm(res, i);
            }
            System.out.println(res);
        }
    }
    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }   
}

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
public class J01021 {
    static int mod = 1000000007;
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n == 0 && k == 0) break;
            System.out.println(powmod(n, k));
        }
    }
    public static long powmod(long n, long k) {
        if(k == 0) return 1;
        if(k == 1) return n % mod;
        long temp = powmod(n, k/2);
        if(k % 2 == 0) return temp * temp % mod;
        return temp * temp % mod * n % mod;
    }
}

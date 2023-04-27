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
public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            long n = sc.nextLong();
            if(CheckFibo(n) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static int CheckFibo(long n) {
        long[] f = new long[93];
        f[0] = 0; f[1] = 1;
        for(int i = 2; i <= 92; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        for(int i = 0; i <= 92; i++) {
            if(f[i] == n) return 1;
        }
        return 0;
    }
}

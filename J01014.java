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
public class J01014 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            long n = sc.nextLong();
            if(prime(n) == 1) {
                System.out.println(n);
            }
            else {
                for(long i = 2; i <= n; i++) {
                    if(n % i == 0 && prime(n / i) == 1) {
                        System.out.println(n / i);
                        break;
                    }
                }
            }
        }
    }
    public static int prime(long n) {
        if(n < 2) return 0;
        if(n == 2 || n == 3) return 1;
        if(n % 2 == 0 || n % 3 == 0) return 0;
        for(int i = 5; i <= Math.sqrt(n); i += 6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return 0;
        }
        return 1;
    }   
}

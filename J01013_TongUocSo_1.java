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
public class J01013_TongUocSo_1 {
    static boolean[] prime = new boolean[2000001];
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Eratosthenes();
        int t = sc.nextInt();
        long res = 0;
        while(t--> 0) {
            int n = sc.nextInt();
            for(int i = 2; i <= n; i++) {
                if(prime[n] == true) {
                    res += n;
                    break;
                }
                if(prime[i] == true) {
                    while(n % i == 0) {
                        res += i;
                        n /= i;
                    }
                }
            }
        }
        System.out.println(res);
    }
    public static void Eratosthenes() {
        for(int i = 0; i <= 2000000; i++) {
            prime[i] = true;
        }
        for(int i = 2; i * i <= 2000000; i++) {
            if(prime[i] == true) {
                for(int j = i * i; j <= 2000000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}

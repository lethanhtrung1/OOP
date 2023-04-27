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
public class J02007 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 1; j <= t; j++) {
            System.out.printf("Test %d:\n", j);
            int n = in.nextInt();
            int[] a = new int[n+5];
            int[] cnt = new int[100000];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                cnt[a[i]]++;
            }
            for(int i = 0; i < n; i++) {
                if(cnt[a[i]] != 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                    cnt[a[i]] = 0;
                }
            }
        }
    }   
}

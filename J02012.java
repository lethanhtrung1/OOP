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
public class J02012 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+5];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int x = a[i], pos = i - 1;
            while(pos >= 0 && a[pos] > x) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
            System.out.printf("Buoc %d: ", i);
            for(int j = 0; j <= i; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}

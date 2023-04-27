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
public class J02013 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+5];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            boolean check = true;
            for(int j = 1; j < n - i; j++) {
                if(a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    check = false;
                }
            }
            if(check == true) break;
            System.out.printf("Buoc %d: ", i + 1);
            for(int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}

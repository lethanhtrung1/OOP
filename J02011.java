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
public class J02011 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+5];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            int min_pos = i;
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[min_pos]) {
                    min_pos = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_pos];
            a[min_pos] = temp;
            System.out.printf("Buoc %d: ", i + 1);
            for(int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}

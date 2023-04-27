/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J02020_LietKeToHop_1 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[k+1];
        for(int i = 1; i <= k; i++) {
            a[i] = i;
        }
        int count = 0;
        boolean check = false;
        while(!check) {
            count++;
            for(int i = 1; i <= k; i++) {
                System.out.printf("%d ", a[i]);
            }
            boolean flag = true;
            System.out.println();
            for(int i = k; i > 0; i--) {
                if(a[i] != n - k + i) {
                    a[i]++;
                    flag = false;
                    for(int j = i + 1; j <= k; j++) {
                        a[j] = a[j - 1] + 1;
                    }
                    break;
                }
            }
            if(flag == true) check = true;
        }
        System.out.println("Tong cong co " + count + " to hop");
    }
}

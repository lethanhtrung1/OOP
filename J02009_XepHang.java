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
public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] T = new int[n+5];
        int[] D = new int[n+5];
        for(int i = 0; i < n; i++) {
            T[i] = in.nextInt();
            D[i] = in.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n ; j++) {
                if(T[i] > T[j]) {
                    int tmp1 = T[i]; T[i] = T[j]; T[j] = tmp1;
                    int tmp2 = D[i]; D[i] = D[j]; D[j] = tmp2;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(T[i] + D[i] > T[i+1]) {
                T[i+1] = T[i] + D[i];
            }
        }
        System.out.println(T[n-1] + D[n-1]);
    }
}

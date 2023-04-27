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
public class J02103 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x = 1; x <= t; x++) {            
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n+1][m+1];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int[][] b = new int[n+1][n+1];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    b[i][j] = a[j][i];
                }
            }            
            int[][] res = new int[n+1][n+1];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    res[i][j] = 0;
                    for(int k = 0; k < m; k++) {
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", x);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.printf("%d ", res[i][j]);
                }
                System.out.println();
            }
        }
    }
}

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
public class J02005_HopCuaHaiDaySo {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1005];
        int[] b = new int[1005];
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x] = 1;
        }
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            b[x] = 1;
        }
        for(int i = 0; i <= 1000; i++) {
            if(a[i] == 1 && b[i] == 1) {
                System.out.printf("%d ", i);
            }
        }
    }
}

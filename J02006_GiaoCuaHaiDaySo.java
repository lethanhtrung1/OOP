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
public class J02006_GiaoCuaHaiDaySo {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1005];
        int[] b = new int[1005];
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x]++;
        }
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            b[x]++;
        }
        for(int i = 0; i <= 1000; i++) {
            if(a[i] != 0 || b[i] != 0) {
                System.out.printf("%d ", i);
            }
        }
    } 
}

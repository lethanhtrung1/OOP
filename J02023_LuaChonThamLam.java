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
public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        process(n, s);
    }
    public static void process(int n, int s) {
        if(n == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }
        if(s == 0 && n > 1 || s > 9 * n) {
            System.out.println("-1 -1");
            return;
        }
        int[] a = new int[1005];
        int[] b = new int[1005];
        int sum = s;
        for(int i = n - 1; i >= 0; i--) {
            for(int j = 9; j > 0; j--) {
                if(sum - j >= 0) {
                    a[i] = j;
                    sum -= j;
                    break;
                }
            }
            if(a[i] == 0) break;
        }
        if(a[0] == 0) {
            a[0] = 1;
            for(int i = 1; i < n; i++) {
                if(a[i] != 0) {
                    a[i]--;
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 9; j > 0; j--) {
                if(s - j >= 0) {
                    b[i] = j;
                    s -= j;
                    break;
                }
            }
            if(b[i] == 0) break;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
        for(int i = 0; i < n; i++) {
            System.out.print(b[i]);
        }
    }
}

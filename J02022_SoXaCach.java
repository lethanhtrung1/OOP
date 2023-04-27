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
public class J02022_SoXaCach {
    static int[] check = new int[10];
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            Try("", n);
        }
    }
    public static void Try(String s, int n) {
        if(s.length() == n) {
            System.out.println(s);
        }
        for(int i = 1; i <= n; i++) {
            if(s.length() == 0 || (check[i] == 0 && Math.abs(s.charAt(s.length() - 1) - '0' - i) != 1)) {
                check[i] = 1;
                Try(s + Integer.toString(i), n);
                check[i] = 0;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n+5][n+5];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                arr.add(a[i][j]);
            }
        }
        Collections.sort(arr);
        int inx = 0, m = n;
        for(int i = 0; i <= m / 2; i++) {
            for(int j = i; j < n; j++)
                a[i][j] = arr.get(inx++);
            for(int j = i + 1; j < n; j++)
                a[j][n-1] = arr.get(inx++);
            for(int j = n - 2; j >= i; j--)
                a[n-1][j] = arr.get(inx++);
            for(int j = n - 2; j > i; j--)
                a[j][i] = arr.get(inx++);
            n--;
        }
         for(int i = 0; i < m; i++) {
             for(int j = 0; j < m; j++) {
                 System.out.print(a[i][j] + " ");
             }
             System.out.println();
         }
    }
}

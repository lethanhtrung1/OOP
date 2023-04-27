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
public class J02026_DayConCoKPhanTuTangDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int[] a = new int[k+5];
            for(int i = 0; i < n; i++) {
                int x = in.nextInt();
                arr.add(x);
            }
            for(int i = 1; i <= k; i++) {
                a[i] = i;
            }
            Collections.sort(arr);
            while(true) {
                int stop = 0;
                for(int i = 1; i <= k; i++) {
                    System.out.print(arr.get(a[i] - 1) + " ");
                }
                System.out.println();
                for(int i = k; i > 0; i--) {
                    if(a[i] != n - k + i) {
                        a[i]++;
                        stop++;
                        for(int j = i + 1; j <= k; j++) {
                            a[j] = a[j-1] + 1;
                        }
                        break;
                    }
                }
                if(stop == 0) break;
            }
        }
    }
}

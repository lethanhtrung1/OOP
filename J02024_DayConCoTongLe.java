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
public class J02024_DayConCoTongLe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int x = in.nextInt();
                arr.add(x);
            }
            int[] a = new int[20];
            int check;
            for(int i = 0; i <= n; i++) a[i] = 0;
            Collections.sort(arr);
            Collections.reverse(arr);
            while(true) {
                check = 0;
                for(int i = n - 1; i >= 0; i--) {
                    if(a[i] == 0) {
                        a[i] = 1;
                        check++;
                        for(int j = i + 1; j < n; j++)
                            a[j] = 0;
                        break;
                    }
                }
                if(check == 0) break;
                int sum = 0;
                for(int i = 0; i < n; i++) {
                    if(a[i] == 1) sum += arr.get(i);
                }
                if(sum % 2 == 1) {
                    for(int i = 0; i < n; i++) {
                        if(a[i] == 1) {
                            System.out.print(arr.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}

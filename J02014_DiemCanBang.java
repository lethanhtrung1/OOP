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
public class J02014_DiemCanBang {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] a = new int[n+5];
            int sum_right = 0;
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum_right += a[i];
            }
            int sum_left = 0;
            int pos = -1;
            for(int i = 0; i < n; i++) {
                sum_right -= a[i];
                if(sum_right == sum_left) {
                    pos = i + 1;
                    break;
                }
                sum_left += a[i];
            }
            System.out.println(pos);
        }
    }
}

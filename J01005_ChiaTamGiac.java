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
public class J01005_ChiaTamGiac {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            double h = in.nextDouble();
            for(int i = 1; i < n; i++) {
                double x = Math.sqrt((double)i / n) * h;
                System.out.printf("%.6f ", x);
            }
            System.out.println();
        }
    }    
}

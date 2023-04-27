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
public class J01025_HinhVuong {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int xmin = Math.min(a1, a2);
        int ymin = Math.min(b1, b2);
        int xmax = Math.max(c1, c2);
        int ymax = Math.max(d1, d2);
        int edge = Math.max((xmax - xmin), (ymax - ymin));
        System.out.println(edge * edge);
    }   
}

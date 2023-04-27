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
public class J01024 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            long n = sc.nextLong();
            if(check(n) == true)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(long n) {
        while(n != 0) {
            if(n % 10 > 2) return false;
            n /= 10;
        }
        return true;
    }   
}

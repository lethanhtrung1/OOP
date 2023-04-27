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
public class J01018 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            String s = sc.next();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s) {
        int sum = s.charAt(0) - '0';
        for(int i = 1; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
            if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 2) return false;
        }
        if(sum % 10 != 0) return false;
        return true;
    }
}

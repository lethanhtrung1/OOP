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
public class J03007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String s = in.next();
            if(check(s) == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s) {
        String tmp = "";
        long sum = 0;
        if(s.charAt(0) != '8' && s.charAt(s.length() - 1) != '8')
            return false;
        for(int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
            tmp = s.charAt(i) + tmp;
        }
        if(sum % 10 == 0 && s.compareTo(tmp) == 0) 
            return true;
        else return false;
    }
}

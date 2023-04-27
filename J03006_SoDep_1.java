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
public class J03006_SoDep_1 {
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
        for(int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i) % 2 == 1)
                return false;
            tmp = s.charAt(i) + tmp;
        }
        if(s.compareTo(tmp) == 0) return true;
        else return false;
    }    
}

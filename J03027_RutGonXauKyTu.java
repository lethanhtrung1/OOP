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
public class J03027_RutGonXauKyTu {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        while(true) {
            boolean stop = true;
            for(int i = 0; i < s.length() - 1; i++) {
                if(s.charAt(i) == s.charAt(i + 1)) {
                    stop = false;
                    s = s.substring(0, i) + s.substring(i + 2, s.length());
                }
            }
            if(stop) break;
        }
        if(s.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }    
}

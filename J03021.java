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
public class J03021 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            String a = "", b = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'B' || s.charAt(i) == 'b' || s.charAt(i) == 'C' || s.charAt(i) == 'c') a += 2;
                else if(s.charAt(i) == 'D' || s.charAt(i) == 'd' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'F' || s.charAt(i) == 'f') a += 3;
                else if(s.charAt(i) == 'G' || s.charAt(i) == 'g' || s.charAt(i) == 'H' || s.charAt(i) == 'h' || s.charAt(i) == 'I' || s.charAt(i) == 'i') a += 4;
                else if(s.charAt(i) == 'J' || s.charAt(i) == 'j' || s.charAt(i) == 'K' || s.charAt(i) == 'k' || s.charAt(i) == 'L' || s.charAt(i) == 'l') a += 5;
                else if(s.charAt(i) == 'M' || s.charAt(i) == 'm' || s.charAt(i) == 'N' || s.charAt(i) == 'n' || s.charAt(i) == 'O' || s.charAt(i) == 'o') a += 6;
                else if(s.charAt(i) == 'P' || s.charAt(i) == 'p' || s.charAt(i) == 'Q' || s.charAt(i) == 'q' || s.charAt(i) == 'R' || s.charAt(i) == 'r' || s.charAt(i) == 'S' || s.charAt(i) == 's') a += 7;
                else if(s.charAt(i) == 'T' || s.charAt(i) == 't' || s.charAt(i) == 'U' || s.charAt(i) == 'u' || s.charAt(i) == 'V' || s.charAt(i) == 'v') a += 8;
                else a += 9;               
            }
            for(int i = 0; i < s.length(); i++) {
                b = a.charAt(i) + b;
            }
            if(a.compareTo(b) == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }  
}

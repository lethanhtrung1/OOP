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
public class J03008 {
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
            if(isPrime(s.charAt(i) - '0') == false)
                return false;
            tmp = s.charAt(i) + tmp;
        }
        if(s.compareTo(tmp) == 0) 
            return true;
        else return false;
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i < Math.sqrt(n); i += 6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }   
}

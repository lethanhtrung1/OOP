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
public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            Long res = convert(s);
            if(res == -1L || res == 0)
                System.out.println("INVALID");
            else System.out.println(res);
        }
    }
    public static Long convert(String s) {
        Long res = 0L;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9')
                res = res * 10;
            else if(s.charAt(i) == '1')
                res = res * 10 + 1;
            else return -1L;
        }
        return res;
    }
}



//public class NewClass1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t--> 0) {
//            String s = sc.next();
//            s = convert(s);
//            if(s == "INVALID")
//                System.out.println(s);
//            else
//                System.out.println(Long.parseLong(s));
//        }
//    }
//    public static String convert(String s) {
//        String res = "";
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9')
//                return "INVALID";
//            else if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') res += "0";
//            else res += "1";
//        }
//        for(int i = 0; i < res.length(); i++) {
//            if(res.charAt(i) != '0') return res;
//        }
//        return "INVALID";
//    }
//}
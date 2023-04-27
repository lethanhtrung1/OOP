/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner in = new Scanner(file);
        long number = 0;
        while(in.hasNext()) {
            String s = in.next();
            if(check(s)) {
                number += Integer.parseInt(s);
            }
        }
        System.out.println(number);
    }
    public static boolean check(String s) {
        long num = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
            num = num * 10 + s.charAt(i) - '0';
            if(num > 1e9+7) return false;
        }
        return true;
    }    
}

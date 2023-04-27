/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(in.hasNext()) {
            String s = in.next();
            if(!check(s)) {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(String it : arr) {
            System.out.print(it + " ");
        }
    }
    public static boolean check(String s) {
        int n = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
            n = n * 10 + s.charAt(i) - '0';
            if(n > 1e9+7) return false;
        }
        return true;
    }
}

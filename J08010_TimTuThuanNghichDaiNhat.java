/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J08010_TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new LinkedHashMap<>();
        int len_max = 0;
        while(in.hasNext()) {
            String s = in.next();
            if(s.equals(new StringBuilder(s).reverse().toString())) {
                if(!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.replace(s, map.get(s) + 1);
                }
                len_max = Math.max(len_max, s.length());
            }
        }
        for(String it : map.keySet()) {
            if(it.length() == len_max) {
                System.out.println(it + " " + map.get(it));
            }
        }
    }
}
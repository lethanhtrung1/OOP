/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */
public class J03020_TimTuThuanNghichDaiNhat {
    public static boolean check(String s) {
        StringBuilder tmp = new StringBuilder(s);
        return s.equals(tmp.reverse().toString());
    }    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        int max = 0;
        while(in.hasNextLine()) {
            String s = in.nextLine();
            str += s + " ";
            if(s.isEmpty())
                break;
        }
        List<String> arr = Arrays.asList(str.split("\\s+"));
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String it : arr) {
            if(check(it)) {
                if(it.length() > max) max = it.length();
                if(map.containsKey(it)) {
                    map.replace(it, map.get(it) + 1);
                } else {
                    map.put(it, 1);
                }
            }
        }
        for(String it : map.keySet()) {
            if(it.length() == max) {
                System.out.println(it + " " + map.get(it));
            }
        }
    }
}
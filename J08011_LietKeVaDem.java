/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J08011_LietKeVaDem {
    public static boolean check(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(in.hasNext()) {
            String s = in.next();
            if(check(s)) {
                if(!map.containsKey(s)) map.put(s, 1);
                else map.replace(s, map.get(s) + 1);
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        for(String it : map.keySet()) {
            arr.add(it);
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) <= map.get(o2)) return 1;
                else return -1;
            }
        });
        for(String it : arr) {
            System.out.println(it + " " + map.get(it));
        }
    }
}

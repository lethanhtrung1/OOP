/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;
import java.io.*;

/**
 *
 * @author TRUNG
 */
public class J07032_SoThuanNghichTrongFILE {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int it : arr1) {
            if(check(it)) {
                if(map1.containsKey(it))
                    map1.replace(it, map1.get(it) + 1);
                else
                    map1.put(it, 1);
            }
        }
        for(int it : arr2) {
            if(check(it)) {
                if(map2.containsKey(it))
                    map2.replace(it, map2.get(it) + 1);
                else
                    map2.put(it, 1);
            }
        }
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>(map1.keySet());
        Collections.sort(arr);
        for(int it : arr) {
            if(map2.containsKey(it)) {
                System.out.printf("%d %d\n", it, map1.get(it) + map2.get(it));
                cnt++;
            }
            if(cnt == 10) break;
        }
    }
    public static boolean check(int n) {
        String s = String.valueOf(n);
        for(int i = 0; i <= s.length() / 2; i++) {
            if((s.charAt(i) - 48) % 2 ==0) return false;
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        if(s.length() % 2 == 1 && s.length() > 1) return true;
        return false;
    }
}

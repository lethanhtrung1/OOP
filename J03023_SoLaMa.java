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
public class J03023_SoLaMa {
    public static void main(String[] args) {
        String[] key = {"I", "V", "X", "L", "C", "D", "M", "IV", "IX", "XL", "XC", "CD", "CM"};
        int[] value = {1, 5, 10, 50, 100, 500, 1000, 4, 9, 40, 90, 400, 900};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 13; i++) {
            map.put(key[i], value[i]);
        }
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String s = in.next();
            int res = 0;
            for(int i = 0; i < s.length(); i++) {
                if(i < s.length() - 1) {
                    String tmp = s.substring(i, i + 2);
                    if(map.containsKey(tmp)) {
                        res += map.get(tmp);
                        i++;
                        continue;
                    }
                }
                res += map.get(String.valueOf(s.charAt(i)));
            }
            System.out.println(res);
        }
    }
}

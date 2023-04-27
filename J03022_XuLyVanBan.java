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
public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        while(in.hasNextLine()) {
            s += in.nextLine();
        }
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, ".!?");
        while(st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }
        for(String it : arr) {
            System.out.println(format(it));
        }
    }
    public static String format(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            for(int i = 0; i < tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        res.setCharAt(0, Character.toUpperCase(res.charAt(0)));
        return res.toString().trim();
    }
}

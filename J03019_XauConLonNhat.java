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
public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int idx = 0;
        for(int i = 'z'; i >= 'a'; i--) {
            for(int j = idx; j < s.length(); j++) {
                if(s.charAt(j) == i) {
                    System.out.print(String.valueOf(s.charAt(j)));
                    idx = j;
                }
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J03010 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        List<String> list_email = new ArrayList<>();
        while(t-->0) {
            String s = in.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            while(s.contains("  ") == true) {
                s = s.replace("  ", " ");
            }
            String[] arr = s.split(" ");
            String res = "";
            res = res + arr[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++) {
                res += arr[i].charAt(0);
            }
            list_email.add(res);
            if(list_email.contains(res) == true) {
                if(Collections.frequency(list_email, res) > 1) {
                    res += Collections.frequency(list_email, res);
                }
            }
            res += "@ptit.edu.vn";
            System.out.println(res);
        } 
    }
}

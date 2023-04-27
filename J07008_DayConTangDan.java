/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07008_DayConTangDan {
    static int n;
    static int[] a = new int[25];
    static ArrayList<String> arr = new ArrayList<>();
    static ArrayList<String> res = new ArrayList<>();
    static void Try(int j) {
        for(int i = 0; i <= 1; i++) {
            a[j] = i;
            if(j == n) {
                int cmp = -1, check = 0;
                String str = "";
                for(int k = 1; k <= n; k++) {
                    if(a[k] == 1) {
                        if(Integer.parseInt(arr.get(k-1)) <= cmp) {
                            check = 0;
                            break;
                        }
                        else {
                            cmp = Integer.parseInt(arr.get(k-1));
                            str += arr.get(k-1) + " ";
                            check++;
                        }
                    }
                }
                if(check > 1)
                    res.add(str);
            }
            else {
                Try(j + 1);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        s += " ";
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp += s.charAt(i);
            } else {
                if(temp.compareTo("") != 0)
                    arr.add(temp);
                temp = "";
            }
        }
        Try(1);
        Collections.sort(res);
        for(String it : res) {
            System.out.println(it);
        }
    }
}

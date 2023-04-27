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

class Name implements Comparable<Name> {
    private String name, firstName, lastName, fullName;
    public Name(String name) {
        this.fullName = name;
        String[] str = name.split(" ");
        this.lastName = str[str.length - 1];
        String s1 = "", s2 = "";
        for(int i = 0; i < str.length - 1; i++) {
            s1 += str[i] + " ";
            s2 += str[i].substring(0, 1) + ".";
        }
        this.firstName = s1;
        this.name = s2 + str[str.length - 1].substring(0, 1);
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Name o) {
        if(this.lastName.compareTo(o.lastName) > 0) return 1;
        else if(this.lastName.compareTo(o.lastName) == 0) {
            if(this.firstName.compareTo(o.firstName) > 0) return 1;
        }
        return -1;
    }
    @Override
    public String toString() {
        return fullName;
    }
}

public class J07071_TenVietTat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> arr = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            arr.add(new Name(in.nextLine()));
        }
        int m = in.nextInt();
        in.nextLine();
        while(m-->0) {
            ArrayList<Name> res = new ArrayList<>();
            String str = in.nextLine();
            for(Name it : arr) {
                if(check(str, it.getName())) {
                    res.add(it);
                }
            }
            Collections.sort(res);
            for(Name it : res) {
                System.out.println(it);
            }    
        }
    }
    public static boolean check(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '*') cnt1++;
            if(s1.charAt(i) != s2.charAt(i)) cnt2++;
        }
        if((cnt2 == 0 && cnt1 == 0) || (cnt1 == 1 && cnt2 == 1)) return true;
        return false;
    }
}

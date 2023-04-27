/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author TRUNG
 */

class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(TreeSet<String> set) {
        this.set = new TreeSet<>();
    }   
    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            set.add(st.nextToken().toLowerCase());
        }
    }
    public String union(WordSet w) {
        TreeSet<String> tmp = new TreeSet<>();
        for(String it : this.set) {
            tmp.add(it);
        }
        for(String it : w.set) {
            tmp.add(it);
        }
        String res = "";
        for(String it : tmp) {
            res += it + " ";
        }
        return res;
    }
    public String intersection(WordSet w) {
        String res = "";
        for(String it : this.set) {
            if(w.set.contains(it)) {
                res += it + " ";
            }
        }
        return res;
    }
}

public class J04022_WORDSET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

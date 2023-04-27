/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author TRUNG
 */

class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();
    
    public IntSet() {
        this.set.clear();
    }
    
    public IntSet(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
    }
    
    public IntSet intersection(IntSet x) {
        IntSet res = new IntSet();
        for(Integer it : this.set) {
            if(x.set.contains(it)) {
                res.set.add(it);
            }
        }
        return res;
    }
    
    @Override
    public String toString() {
        String res = "";
        for(Integer it : set) {
            res += it + " ";
        }
        return res;
    }
}

public class J07009_LopINTSET_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

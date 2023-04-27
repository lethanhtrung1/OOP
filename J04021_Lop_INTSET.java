/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author TRUNG
 */

class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();
    public IntSet(TreeSet<Integer> set) {
        this.set = new TreeSet<>(set);
    }    
    public IntSet(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
    }
    public IntSet union(IntSet x) {
        TreeSet<Integer> tmp = new TreeSet<>();
        for(Integer it : this.set) {
            tmp.add(it);
        }
        for(Integer it : x.set) {
            tmp.add(it);
        }
        return new IntSet(tmp);
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

public class J04021_Lop_INTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

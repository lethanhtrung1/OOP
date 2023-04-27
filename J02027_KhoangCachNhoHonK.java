/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

public class J02027_KhoangCachNhoHonK {
    public static int binarySearch(ArrayList<Integer> arr, int l, int r, int x) {
        if(l > r) return l;
        int m = (l + r) / 2;
        if(arr.get(m) < x) return binarySearch(arr, m + 1, r, x);
        else return binarySearch(arr, l, m - 1, x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            int n = in.nextInt();
            int k = in.nextInt();
            for(int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            Collections.sort(arr);
            long res = 0;
            for(int i = 0; i < arr.size(); i++) {
                int pos = binarySearch(arr, i + 1, n - 1, k + arr.get(i));
                res += pos - i - 1;
            }
            System.out.println(res);
        }
    }
}

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
public class J08015_CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int x = in.nextInt();
                arr.add(x);
            }
            Collections.sort(arr);
            long res = 0;
            for(int i = 0; i < n - 1; i++) {
                int key = k - arr.get(i);
                res += (upper(arr, key, i) - lower(arr, key, i));
            }
            System.out.println(res);
        }
    }
    public static int lower(ArrayList<Integer> arr, int key, int x) {
        int mid, n = arr.size();
        int low = x + 1, high = n;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(key <= arr.get(mid))
                high = mid;
            else
                low = mid + 1;
        }
        if(low < arr.size() && arr.get(low) < key)
            low++;
        return low;
    }
    public static int upper(ArrayList<Integer> arr, int key, int x) {
        int mid, n = arr.size();
        int low = x + 1, high = n;
        while(low < high && low != n) {
            mid = low + (high - low) / 2;
            if(key >= arr.get(mid))
                low = mid + 1;
            else
                high = mid;
        }
        if(low == n) return n;
        return low;
    }
}
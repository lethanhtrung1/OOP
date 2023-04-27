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
public class J02016_BoBaSoPYTAGO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0) {
            int n = in.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                long x = in.nextLong();
                arr.add(x * x);
            }
            Collections.sort(arr);
            if(check(n, arr) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");            
        }
    }
    public static int check(int n, ArrayList<Long> arr) {
        for(int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while(left < right) {
                if(arr.get(left) + arr.get(right) == arr.get(i))
                    return 1;
                else if(arr.get(left) + arr.get(right) < arr.get(i))
                    left++;
                else
                    right--;
            }
        }
        return 0;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            long min_val = 1000000000, max_val = -100000000;
            for(int i = 0; i < n; i++) {
                Long tmp = in.nextLong();
                arr.add(tmp);
                min_val = Math.min(min_val, arr.get(i));
                max_val = Math.max(max_val, arr.get(i));
            }
            System.out.println(solution(arr, n, min_val, max_val));
        }
    }
    public static int solution(ArrayList<Long> arr, int n, long min, long max) {
        int cnt = 0;
        while(true) {
            if(arr.get(0) == min && arr.get(n - 1) == max)
                return cnt;
            arr.add(arr.get(0));
            arr.remove(0);
            cnt++;
        }
    }
}

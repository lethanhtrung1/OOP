/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            String[] arr = s.split(" ");
            if(check(arr))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean check(String[] arr) {
        int cnt1 = 0, cnt2 = 0;
        for (String it : arr) {
            if (Integer.parseInt(it) % 2 == 0) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        if(arr.length % 2 == 0 && cnt1 > cnt2) return true;
        else if(arr.length % 2 == 1 && cnt1 < cnt2) return true;
        return false;
    }
}
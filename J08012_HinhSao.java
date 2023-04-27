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
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean check = false;
        int[] arr = new int[n + 1];
        for(int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            arr[u]++;
            arr[v]++;
            if(arr[u] == n - 1 || arr[v] == n - 1)
                check = true;
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}

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
public class J02017_ThuGonDaySo {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            a.add(x);
        }       
        while(true) {
            int cnt = 0;
            for(int i = 0; i < a.size() - 1; i++) {
                if((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    cnt++;
                    a.remove(i + 1);
                    a.remove(i);
                }
            }
            if(cnt == 0) break;
        }
        System.out.println(a.size());
    }    
}

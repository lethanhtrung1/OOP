/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            Queue<String> q = new LinkedList<>();
            ArrayList<String> arr = new ArrayList<>();
            q.offer("6");
            q.offer("8");
            while(!q.isEmpty()) {
                String top = q.poll();
                arr.add(top);
                if(top.length() < n) {
                    q.offer(top + "6");
                    q.offer(top + "8");
                }
            }
            System.out.println(arr.size());
            Collections.reverse(arr);
            for(String it : arr) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}

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
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.offer(9);
            while(!q.isEmpty()) {
                int top = q.poll();
                if(top % n == 0) {
                    System.out.println(top);
                    break;
                }
                q.offer(top * 10);
                q.offer(top * 10 + 9);
            }
        }
    }
}

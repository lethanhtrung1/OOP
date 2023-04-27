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
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int[] pos = new int[n+1];
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                arr.add(in.nextInt());
                pos[i] = -1;
            }
            for(int i = 0; i < n; i++) {
                while(!st.empty() && arr.get(i) > arr.get(st.peek())) {
                    pos[st.peek()] = i;
                    st.pop();
                }
                st.push(i);
            }
            for(int i = 0; i < n; i++) {
                if(pos[i] == -1)
                    System.out.print(-1 + " ");
                else
                    System.out.print(arr.get(pos[i]) + " ");
            }
            System.out.println();
        }
    }
}

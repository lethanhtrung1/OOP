/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author TRUNG
 */
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            Stack<Integer> st = new Stack<>();
            st.push(0);
            res.add(1);
            for(int i = 1; i < n; i++) {
                while(!st.empty() && arr.get(st.peek()) <= arr.get(i)) {
                    st.pop();
                }
                if(st.empty()) res.add(i+1);
                else res.add(i - st.peek());
                st.push(i);
            }
            for(Integer x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

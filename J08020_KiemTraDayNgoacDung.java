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

public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String s = in.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for(Character it : s.toCharArray()) {
            if(it == '{' || it == '[' || it == '(')
                st.push(it);
            else {
                if(st.empty()) return false;
                if(it == '}' && st.peek() == '{') st.pop();
                else if(it == ']' && st.peek() == '[') st.pop();
                else if(it == ')' && st.peek() == '(') st.pop();
                else return false;
            }
        }
        if(!st.empty()) return false;
        return true;
    }
}
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

class Student000 {
    private String id, name, class_id, note;
    
    public Student000(String id, String name, String class_id) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.note = "";
    }

    public String getId() {
        return id;
    }

    public void setNote(String s) {
        int p = 10;
        for(Character it : s.toCharArray()) {
            if(it == 'v') p -= 2;
            else if(it == 'm') p--;
        }
        if(p <= 0) this.note = "0 KDDK";
        else this.note = String.valueOf(p);
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + class_id + " " + note;
    }
}

public class J05074_DiemDanh_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student000> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new Student000(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        for(int i = 0; i < n; i++) {
            String str = in.next();
            for(Student000 it : arr) {
                if(it.getId().equals(str)) {
                    it.setNote(str);
                    break;
                }
            }
        }
        for(Student000 it : arr) {
            System.out.println(it);
        }
    }
}

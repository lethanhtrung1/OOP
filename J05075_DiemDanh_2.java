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

class Student0000 {
    private String id, name, class_id, note;
    
    public Student0000(String id, String name, String class_id) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
    }
    
    public void setNote(String s) {
        int point = 10;
        for(Character it : s.toCharArray()) {
            if(it == 'v') point -= 2;
            else if(it == 'm') point--;
        }
        if(point <= 0) this.note = "0 KDDK";
        else this.note = String.valueOf(point);
    }

    public String getId() {
        return id;
    }

    public String getClass_id() {
        return class_id;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + class_id + " " + note;
    }
}

public class J05075_DiemDanh_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student0000> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new Student0000(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        for(int i = 0; i < n; i++) {
            String str = in.next();
            for(Student0000 it : arr) {
                if(it.getId().equals(str)) {
                    it.setNote(in.next());
                }
            }
        }
        String class_id = in.next();
        for(Student0000 it : arr) {
            if(it.getClass_id().equals(class_id)) {
                System.out.println(it);
            }
        }
    }
}
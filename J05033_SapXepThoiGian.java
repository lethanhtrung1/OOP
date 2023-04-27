/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */


class Time {
    private int hour, minute, second;
    public void input(Scanner in) {
        hour = in.nextInt();
        minute = in.nextInt();
        second = in.nextInt();
    }
    public void output() {
        System.out.println(hour + " " + minute + " " + second);
    }
    public int getTime() {
        return hour * 60 * 60 + minute * 60 + second;
    }
}

public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Time> listTime = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Time temp = new Time();
            temp.input(in);
            listTime.add(temp);
        }
        Collections.sort(listTime, Comparator.comparing(Time::getTime));
        for(Time it : listTime) {
            it.output();
        }
    }   
}

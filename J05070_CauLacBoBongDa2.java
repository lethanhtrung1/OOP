/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Club1 {
    private String id, name;
    private int ticket;
    
    public Club1(String id, String name, int ticket) {
        super();
        this.id = id;
        this.name = name;
        this.ticket = ticket;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTicket() {
        return ticket;
    }
}

class Match implements Comparable<Match> {
    private String id;
    private Club1 club;
    private int earning;
    
    public Match(String id, Club1 club, int seat) {
        super();
        this.id = id;
        this.club = club;
        this.earning = this.club.getTicket() * seat;
    }
    
    @Override
    public String toString() {
        return id + " " + club.getName() + " " + earning;
    }
    
    @Override
    public int compareTo(Match o) {
        if(this.earning > o.earning) return -1;
        else if(this.earning < o.earning) return 1;
        else {
            return this.club.getName().compareTo(o.club.getName());
        }
    }
}

public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Club1> arr1 = new ArrayList<>();
        ArrayList<Match> arr2 = new ArrayList<>();
        while(n-- > 0) {
            arr1.add(new Club1(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        int m = Integer.parseInt(in.nextLine());
        while(m-- > 0) {
            String id = in.next();
            int seat = in.nextInt();
            for(Club1 it : arr1) {
                if(it.getId().equals(id.substring(1, 3))) {
                    arr2.add(new Match(id, it, seat));
                }
            }
        }
        Collections.sort(arr2);
        for(Match it : arr2) {
            System.out.println(it);
        }
    }
}

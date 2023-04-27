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

class Club {
    private String id, name;
    private int ticket;

    public Club(String id, String name, int seat) {
        this.id = id;
        this.name = name;
        this.ticket = seat;
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

public class J05069_CauLacBoBongDa1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Club> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new Club(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        int m = Integer.parseInt(in.nextLine());
        while(m-- > 0) {
            String id = in.next();
            int seat = in.nextInt();
            for(Club it : arr) {
                if(it.getId().equals(id.substring(1, 3))) {
                    System.out.println(id + " " + it.getName() + " " + it.getTicket() * seat);
                }
            }
        }
    }
}
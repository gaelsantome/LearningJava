package com.campusdual.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> instruments = new LinkedList<>();
        instruments.offer("Guitar");
        instruments.offer("Piano");
        instruments.offer("Drums");
        instruments.offer("Violin");

        for (String Item : instruments){
            System.out.println(Item);
        }
        String removedInnstrument = instruments.poll();

        System.out.println("Removed :" + removedInnstrument);
        for (String Item : instruments){
            System.out.println(Item);
        }
        String peekedInstrument = instruments.peek();
        System.out.println("\nPeeked: "  +peekedInstrument);

        System.out.println("\nQueue after peeked");
        for (String Item : instruments){
            System.out.println(Item);
        }
    }
}

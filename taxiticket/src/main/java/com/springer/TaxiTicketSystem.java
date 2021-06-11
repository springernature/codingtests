package com.springer;

import java.util.HashMap;
import java.util.Map;

public class TaxiTicketSystem {

    public static void main(String args[]) {
        System.out.println("Hello Taxi Ticket System");

        System.out.println("Taxi Ticket\n-----------");

        String from = "MUMBAI";
        String to = "PUNE";
        int travellersCount = 2;

        System.out.println("Source: " + from);
        System.out.println("Destination: " + to);

        Map<String, Integer> distances = new HashMap<>();
        distances.put("MUMBAI-PUNE", 120);
        distances.put("MUMBAI-GOA", 350);
        distances.put("MUMBAI-NASIK", 180);
        distances.put("PUNE-NASIK", 200);

        Integer distance = distances.get(from + "-" + to);
        if(distance == null){
            distances.get(to + "-" + from);
        }

        System.out.println("Kms: " + distance);
        System.out.println("No. of travellers = " + travellersCount);

        int ticketPrice = 0;
        if(distance > 100) {
            ticketPrice = (750 + ((distance -100) * 5)) * travellersCount;
        }else {
            ticketPrice = 750 * travellersCount;
        }

        System.out.println("Total = " + ticketPrice + " INR");
    }
}

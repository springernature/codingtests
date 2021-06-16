package com.springer;

import java.util.HashMap;
import java.util.Map;

public class ItemisedBillingSystem {

    public static void main(String args[]) {
        System.out.println("Hello ItemisedBillingSystem\n\n");

        System.out.println(String.format("%1$-21s", "Item") + String.format("%1$-15s", "Count") + "Price(INR)");
        Map<String, Integer> orderItems = new HashMap<>();
        orderItems.put("Coffee - Latte", 1);
        orderItems.put("Tea - Ice", 3);
        orderItems.put("Cold Drinks - Pepsi", 2);

        Map<String, Double> itemsMenu = new HashMap<>();
        itemsMenu.put("Tea - Masala", 10.0);
        itemsMenu.put("Tea - Ice", 15.0);
        itemsMenu.put("Coffee - Cold", 15.0);
        itemsMenu.put("Coffee - Latte", 30.0);
        itemsMenu.put("Cold Drinks - Pepsi", 20.0);
        itemsMenu.put("Cold Drinks - Sprite", 15.0);

        double total = 0.0;
        for(Map.Entry<String, Integer> orderItem:orderItems.entrySet()){
            String itemName = orderItem.getKey();
            Integer quantity = orderItem.getValue();
            double price = itemsMenu.get(itemName) * quantity;
            total+=price;
            System.out.println(String.format("%1$-21s", itemName) + String.format("%1$-15s", quantity) + price);
        }
        System.out.println(String.format("%1$-36s", "Total") + total);

        double discount;
        if(total > 200) {
            discount = ((total - 200) * 0.2) + (200 * 0.1);
        }else {
            discount = total * 0.1;
        }
        System.out.println(String.format("%1$-36s", "Discount") + discount);

        double finalAmount = total - discount;
        System.out.println(String.format("%1$-36s", "Final Amount") + finalAmount);
    }
}

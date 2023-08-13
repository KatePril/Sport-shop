package app;

import app.entities.Order;

public class Main {
    public static void main(String[] args) {
        Order orderA = OrderBuilder.collectOrder("A", "red", "white");
        Order orderB = OrderBuilder.collectOrder("B", "blue", "black");

        System.out.println(orderA);
        System.out.println();
        System.out.println(orderB);
    }
}

package app;

import app.entities.Cap;
import app.entities.Order;
import app.entities.TShirt;

public final class OrderBuilder {

    public static Order collectOrder(String orderName, String capColor, String tShirtColor) {
        Order order = new Order(orderName);
        putCap(order, capColor);
        putTShirt(order, tShirtColor);
        order.setSum();
        return order;
    }

    private static void putCap(Order order, String color) {
        order.setCap(new Cap(color));
    }

    private static void putTShirt(Order order, String color) {
        order.settShirt(new TShirt(color));
    }
}

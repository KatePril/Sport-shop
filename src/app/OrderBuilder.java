package app;

import app.entities.Cap;
import app.entities.Order;
import app.entities.TShirt;
import app.enums.Colors;
import app.enums.Manufacturers;

public final class OrderBuilder {

    public static Order collectOrder(String orderName, Manufacturers[] manufacturers, Colors[] colors) {
        Order order = new Order(orderName);
        putCap(order, manufacturers[0], colors[0]);
        putTShirt(order, manufacturers[1], colors[1]);
        order.setSum();
        return order;
    }

    public static void putCap(Order order, Manufacturers manufacturer, Colors color) {
        order.setCap(new Cap(manufacturer, color));
    }

    public static void putTShirt(Order order, Manufacturers manufacturer, Colors color) {
        order.settShirt(new TShirt(manufacturer, color));
    }
}

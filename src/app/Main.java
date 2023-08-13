package app;

import app.entities.Order;
import app.enums.Colors;
import app.enums.Manufacturers;

public class Main {
    public static void main(String[] args) {
        Manufacturers[] manufacturers = new Manufacturers[]{Manufacturers.SMART_CAPS, Manufacturers.ACTIVE_SPORTS};
        Colors[] colorsOrderA = new Colors[]{Colors.WHITE, Colors.RED};
        Colors[] colorsOrderB = new Colors[]{Colors.BLACK, Colors.BLUE};

        Order orderA = OrderBuilder.collectOrder("A", manufacturers, colorsOrderA);
        Order orderB = OrderBuilder.collectOrder("B", manufacturers, colorsOrderB);

        System.out.println(orderA);
        System.out.println();
        System.out.println(orderB);
    }
}

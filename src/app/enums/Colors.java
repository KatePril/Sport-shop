package app.enums;

public enum Colors {
    WHITE("white", 2.00),
    BLACK("black", 4.55),
    RED("red", 3.85),
    BLUE("blue",3.75);

    private final String name;
    private final double price;

    Colors(String color, double price) {
        this.name = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

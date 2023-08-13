package app.enums;

public enum Manufacturers {
    ACTIVE_SPORTS("Active sports", 15.00),
    SMART_CAPS("Smart caps", 10.00);

    private final String name;
    private final double price;

    private Manufacturers(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
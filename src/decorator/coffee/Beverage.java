package decorator.coffee;

public abstract class Beverage {
    String description = "X";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}


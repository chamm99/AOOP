package decorator.coffee;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .6;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}

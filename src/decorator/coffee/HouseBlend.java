package decorator.coffee;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스블렌드";
    }

    @Override
    public double cost() {
        return .89;
    }
}

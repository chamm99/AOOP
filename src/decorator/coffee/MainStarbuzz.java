package decorator.coffee;

public class MainStarbuzz {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        System.out.println(b.getDescription() + " price: $" + b.cost());
        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " price: $" + b2.cost());
        Beverage b3 = new HouseBlend();
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(b3.getDescription() + " price: $" + b3.cost());
    }
}

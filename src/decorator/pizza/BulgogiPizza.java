package decorator.pizza;

class BulgogiPizza extends PizzaDecorator{
    Pizza p;
    public BulgogiPizza(Pizza pizza) {
        p = pizza;
    }

    @Override
    public int getPrice() {
        return p.getPrice() + ToppingsPrice.BULGOGI;
    }

    @Override
    public String getName() {
        return p.getName() + "불고기 ";
    }
}
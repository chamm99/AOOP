package decorator.pizza;

class PotatoPizza extends PizzaDecorator{
    Pizza p;
    public PotatoPizza(Pizza pizza) {
        p = pizza;
    }

    @Override
    public int getPrice() {
        return p.getPrice() + ToppingsPrice.POTATO;
    }

    @Override
    public String getName() {
        return p.getName() + "포테이토 ";
    }
}
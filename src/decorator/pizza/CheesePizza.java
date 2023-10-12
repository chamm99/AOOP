package decorator.pizza;

class CheesePizza extends PizzaDecorator{
    Pizza p;
    public CheesePizza(Pizza pizza) {
        p = pizza;
    }

    @Override
    public int getPrice() {
        return p.getPrice() + ToppingsPrice.CHEESE;
    }

    @Override
    public String getName() {
        return p.getName() + "치즈 ";
    }
}
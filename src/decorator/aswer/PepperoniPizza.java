package decorator.aswer;

class PepperoniPizza extends PizzaDecorator{
    Pizza p;
    
    public PepperoniPizza(Pizza pizza) {
        p = pizza;
    }

    @Override
    public int getPrice() {
        return p.getPrice() + ToppingsPrice.PEPPERONI;
    }

    @Override
    public String getName() {
        return p.getName() + "페퍼로니 ";
    }



}
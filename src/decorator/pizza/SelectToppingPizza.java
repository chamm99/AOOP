package decorator.pizza;

class SelectToppingPizza extends Pizza {
    private boolean pepperoni = false;
    private boolean cheese = false;
    private boolean potato = false;
    private boolean bulgogi = false;

    Pizza p = new Pizza();

    public SelectToppingPizza() {
        super();
    }

    public void addTopping(String toppingName) {
        switch (toppingName) {
            case "Pepperoni":
                pepperoni = true;
                break;
                
            case "Cheese":
                cheese = true;
                break;
                
            case "Potato":
                potato = true;
                break;
                
            case "Bulgogi":
                bulgogi = true;
                break;
                
            default:
                System.out.println("Invalide topping\n");
                break;
        }
    }               
    public String getName() {
        if (bulgogi) {
            p = new BulgogiPizza(p);
        }
        if (potato) {
            p = new PotatoPizza(p);
        }
        if (cheese) {
            p = new CheesePizza(p);
        }
        if (pepperoni) {
            p = new PepperoniPizza(p);
        }
        return p.getName();
    }
    public int getPrice() {
        if (bulgogi) {
            p = new BulgogiPizza(p);
        }
        if (potato) {
            p = new PotatoPizza(p);
        }
        if (cheese) {
            p = new CheesePizza(p);
        }
        if (pepperoni) {
            p = new PepperoniPizza(p);
        }
        return p.getPrice();
    }
}
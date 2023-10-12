package decorator.pizza;

import java.util.List;

class MainUsingSelectToppingPizza {
    public static void main(String[] args) {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("toppings.txt");
        list = loadToppings.load();

        SelectToppingPizza pizza = new SelectToppingPizza();
        for (String topping : list) {
            pizza.addTopping(topping);
        }
        System.out.printf("피자: %s피자, 가격: %d\n", pizza.getName(), pizza.getPrice());
    }
}
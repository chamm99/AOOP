package decorator.pizza;

class ToppingPizza {
    private int size;
    private String name;
    private int price;
	private int toppingPrice;
	private String topping;
	
    public ToppingPizza(String topping, int size, int toppingPrice) {
        this.size = size;
        this.topping = topping;
        this.price = 20000;
        this.toppingPrice = toppingPrice;
        name = topping + " 피자";
    }
    public int getSize() { return size; }
    public String getName() { return name; }
    public int getPrice() { return price + toppingPrice; }
}
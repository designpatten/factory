import java.util.List;
import java.util.ArrayList;

abstract class  PizzaStore{
	Pizza pizza;

	void orderPizza(String type){
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}	

	abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore{
	Pizza createPizza(String type){
		if (type.equals("cheese")) {
			return new NYCheesePizza();
		}else if(type.equals("veggie")){
			return new NYVeggiePizza();
		}else if(type.equals("clam")){
			return new NYClamPizza();	
		}else if(type.equals("pepperoni")){
			return new NYPepperoniPizza();
		}else{
			return null;
		}
		
	}
}

abstract class Pizza{
	String name;
	String dough;	//面团
	String sauce;	//沙司
	ArrayList toppings = new ArrayList();
	void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for (int i = 0; i<toppings.size(); i++) {
			System.out.println("  "+toppings.get(i));
		}
	}
	void bake(){
		System.out.println("bake");
	}
	void cut(){
		System.out.println("cut");
	}
	void box(){
		System.out.println("box");
	}

	public String getName(){
		return name;
	}
}

class NYCheesePizza extends Pizza{
	public NYCheesePizza(){
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}
}

class NYVeggiePizza extends Pizza{
	public NYVeggiePizza(){
		this.name = "NY Style Sauce and Viggie Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Veggie");	
	}
}

class NYClamPizza extends Pizza{
	public NYClamPizza(){
		this.name = "NY Style Sauce and Clam Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Clam");	
	}
}

class NYPepperoniPizza extends Pizza{
	public NYPepperoniPizza(){
		this.name = "NY Style Sauce and Pepperoni Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Pepperoni");	
	}
}


public class Factory{
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
		System.out.println("");
		pizzaStore.orderPizza("veggie");
		System.out.println("");
		pizzaStore.orderPizza("clam");
		System.out.println("");
		pizzaStore.orderPizza("pepperoni");
	}
}


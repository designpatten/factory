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

class ChicagoPizzaStore extends PizzaStore{
	Pizza createPizza(String type){
		if (type.equals("cheese")) {
			return new ChicagoCheesePizza();
		}else if(type.equals("veggie")){
			return new ChicagoVeggiePizza();
		}else if(type.equals("clam")){
			return new ChicagoClamPizza();	
		}else if(type.equals("pepperoni")){
			return new ChicagoPepperoniPizza();
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

class ChicagoCheesePizza extends Pizza{
	public ChicagoCheesePizza(){
		this.name = "Chicago Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}
}

class ChicagoVeggiePizza extends Pizza{
	public ChicagoVeggiePizza(){
		this.name = "Chicago Style Sauce and Viggie Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Veggie");	
	}
}

class ChicagoClamPizza extends Pizza{
	public ChicagoClamPizza(){
		this.name = "Chicago Style Sauce and Clam Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Clam");	
	}
}

class ChicagoPepperoniPizza extends Pizza{
	public ChicagoPepperoniPizza(){
		this.name = "Chicago Style Sauce and Pepperoni Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Pepperoni");	
	}
}


public class Factory{
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		System.out.println("");
		nyPizzaStore.orderPizza("veggie");
		System.out.println("");
		nyPizzaStore.orderPizza("clam");
		System.out.println("");
		nyPizzaStore.orderPizza("pepperoni");


		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("cheese");
		System.out.println("");
		chicagoPizzaStore.orderPizza("veggie");
		System.out.println("");
		chicagoPizzaStore.orderPizza("clam");
		System.out.println("");
		chicagoPizzaStore.orderPizza("pepperoni");


	}
}


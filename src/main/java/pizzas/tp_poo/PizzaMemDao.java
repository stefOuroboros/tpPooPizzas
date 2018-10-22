package pizzas.tp_poo;

public class PizzaMemDao implements IPizzaDao {
	Pizza pizzas[];
	
public PizzaMemDao() {
		pizzas = new Pizza[] {
				new Pizza("MAR", "margarita", 7.0f),
				new Pizza("FOR", "forestiere", 8.0f),
				new Pizza("CAN", "Cannibale", 9.5f)
		};
	}

	public Pizza[] findAllPizzas() {
		for (int i = 0; i < 10; i++) {
			System.out.println(pizzas[i]);
		}
		return this.pizzas;
	}

	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i = 0; i < 10; i++) {
			if (codePizza == pizzas[i].getCode()) {
				this.pizzas[i] = pizza;
			}
		}
	}

	public Pizza findPizzaByCode(String codePizza) {
		for (int i = 0; i < 10; i++) {
			if (codePizza == pizzas[i].getCode()) {
				return pizzas[i];
			}
		}
	return null;
	}

	public boolean isPizzaExists(String codePizza) {
		for (int i = 0; i < 10; i++) {
			if (codePizza == pizzas[i].getCode()) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String pizza = "";
		for (int i=0; i<pizzas.length; i++) {
			pizza += pizzas[i].toString();
		}
		return pizza;
	}
	
}
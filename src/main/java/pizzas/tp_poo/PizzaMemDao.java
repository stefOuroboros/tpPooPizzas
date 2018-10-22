package pizzas.tp_poo;

public class PizzaMemDao implements IPizzaDao {
	Pizzas[];
	public Pizza[] findAllPizzas() {
		
		return Pizza[].findAllPizzas();
	}

	public void updatePizza(String codePizza, Pizza pizza) {

		
	}

	public Pizza findPizzaByCode(String codePizza) {

		return null;
	}

	public boolean isPizzaExists(String codePizza) {

		return false;
	}
	
}
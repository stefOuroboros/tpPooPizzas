package pizzas.tp_poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaMemDao implements IPizzaDao {
	private List<Pizza> listPizza = null;
	
public PizzaMemDao() {
		listPizza = new ArrayList<Pizza>();
		listPizza.add(new Pizza("MAR", "margarita", 7.0f));
		listPizza.add(new Pizza("FOR", "forestiere", 8.0f));
		listPizza.add(new Pizza("CAN", "Cannibale", 9.5f));
	}

	public List<Pizza> findAllPizzas() {
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizza = listPizza.get(i);
			System.out.println(pizza);
		}
		return listPizza;
	}
	
	public void saveNewPizza(Pizza pizza) {
		listPizza.add(pizza);
	};
	public void deletePizza(String codePizza) {
		Pizza p = findPizzaByCode(codePizza);
		listPizza.remove(p);
	};

	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizzaToModify = listPizza.get(i);
			if (codePizza == pizzaToModify.getCode()) {
			pizzaToModify = pizza;
			}
		}
	}

	public Pizza findPizzaByCode(String codePizza) {
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizzaToFind = listPizza.get(i);
			if (codePizza == pizzaToFind.getCode()) {
				return pizzaToFind;
			}
		}
	return null;
	}

	public boolean pizzaExists(String codePizza) {
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizzaIsReal = listPizza.get(i);
			if (codePizza == pizzaIsReal.getCode()) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String pizza = "";
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizzaTS = listPizza.get(i);
			pizza += pizzaTS.toString();
		}
		return pizza;
	}
	
}
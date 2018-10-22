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
	
	public void saveNewPizza(String codePizza, Pizza pizza) throws Exception {
		if (!pizzaExists(codePizza)) {
		listPizza.add(pizza);
		} else { throw new Exception ("Cette pizza existe déjà !"); }
	};
	
	public void deletePizza(String codePizza) throws Exception {
		if (pizzaExists(codePizza)) {
		Pizza p = findPizzaByCode(codePizza);
		listPizza.remove(p);
		} else {
			throw new Exception ("Cette pizza n'existe pas ou a déjà été supprimée !");
		}
	};

	public void updatePizza(String codePizza, Pizza pizza) throws Exception {
		Pizza pizzaToModify = listPizza.get(getPosition(codePizza));
		if(codePizza.length() < 4 && (codePizza.length() > 0)) {
			if (pizza.getName() != null && pizza.getName().length() < 15 && pizza.getName().length() > 4) {
					if (codePizza == pizzaToModify.getCode()) {
						pizzaToModify = pizza;
						}
				} else {
					throw new Exception ("Vous devez saisir un nom de pizza compris entre 4 et 15 caractères.");
				}
		} else {
			throw new Exception ("La taille du code de pizza doit être comprise entre 1 et 4 caractères");
		}
	}

	public String toString() {
		String pizza = "";
		for (int i = 0; i < listPizza.size(); i++) {
			Pizza pizzaTS = listPizza.get(i);
			pizza += pizzaTS.toString();
		}
		return pizza;
	}
	
	public boolean pizzaExists(String codePizza) {
		boolean res = false;
		if (this.findPizzaByCode(codePizza) != null) {
			res = true;
		}
		return res;
	}
	
	private int getPosition(String codePizza) {
		int res = -1;
		for (int i = 0; i < listPizza.size(); i++) {
			if (codePizza == listPizza.get(i).getCode()) {
				res = i;
				break;
			}
		}
		return res;
	}

	public Pizza findPizzaByCode(String codePizza) {
		Pizza res = null;
		int index = getPosition(codePizza);
		if (index != -1) {
			res = listPizza.get(index);
			}
		return res;
	}
}
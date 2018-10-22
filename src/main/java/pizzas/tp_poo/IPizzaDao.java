package pizzas.tp_poo;

import java.util.List;

public interface IPizzaDao {
	List<Pizza> findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void deletePizza(String codePizza);
	
	void updatePizza(String codePizza, Pizza pizza);
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);
}

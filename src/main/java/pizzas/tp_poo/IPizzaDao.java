package pizzas.tp_poo;

import java.util.List;

public interface IPizzaDao {
	List<Pizza> findAllPizzas();
	void saveNewPizza(String codaPizza, Pizza pizza) throws Exception;
	void deletePizza(String codePizza) throws Exception;
	
	void updatePizza(String codePizza, Pizza pizza) throws Exception;
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza) throws Exception;
}

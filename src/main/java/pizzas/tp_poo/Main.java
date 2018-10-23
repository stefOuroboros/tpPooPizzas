package pizzas.tp_poo;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	PizzaMemDao pizzeria = new PizzaMemDao();
        System.out.println( pizzeria);
        
        try {
        	pizzeria.saveNewPizza("BOL", new Pizza("BOL", "bolognaise", 9.50f, Categorie.VIANDE));
            System.out.println(pizzeria);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        try {
        	pizzeria.deletePizza("GIV");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        try {
        	pizzeria.pizzaExists("BOR");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	}
        try {
        	pizzeria.findAllPizzas();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}

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
        	pizzeria.saveNewPizza("BOL", new Pizza ("BOL", "bolognaise", 9.50f));
        	pizzeria.saveNewPizza("BOL", new Pizza ("BOL", "bolognaise", 9.50f));
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}

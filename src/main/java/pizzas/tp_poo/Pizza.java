package pizzas.tp_poo;

public class Pizza {
	private String code;
	private String name;
	private float price;
	
	public Pizza(String code, String name, float price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	//getter
	public String getCode() {return code;}
	public String getName() {return name;}
	public float getPrice() {return price;}
	
	//CONSTRUCTEUR / setter
	public String setCode(String newCode) {code = newCode; return code;}
	public String setName(String newName) {name = newName; return name;}
	public float setPrice(float newPrice) {price = newPrice; return price;}
	
	public String toString() {
		return this.code + " : " + this.name + ",  " + this.price + "€. ";
	}
}
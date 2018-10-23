package pizzas.tp_poo;

public class Pizza {
	private String code;
	private String name;
	private float price;
	private Categorie categorie;
	
	//CONSTRUCTEUR 
	public Pizza(String code, String name, float price, Categorie categorie) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.categorie = categorie;
	}
	
	//getter
	public String getCode() {return code;}
	public String getName() {return name;}
	public float getPrice() {return price;}
	public Categorie getCategorie() {return categorie;}
	
	// setter
	public String setCode(String newCode) {code = newCode; return code;}
	public String setName(String newName) {name = newName; return name;}
	public float setPrice(float newPrice) {price = newPrice; return price;}
	public Categorie setCategorie(Categorie newCategorie) {categorie = newCategorie; return categorie;}
	
	public String toString() {
		return this.code + ", catégorie : " + this.categorie + " "+this.name + ",  " + this.price + "€. ";
	}
}
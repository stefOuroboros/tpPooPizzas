package pizzas.tp_poo;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private double solde;

	public Client(int id, String nom, String prenom, double solde) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
	}

	@SuppressWarnings("unused")
	private void crediterCompte(double montant) throws Exception { 
		if(this.getSolde() + montant > 5000) {
			throw new Exception ("Votre compte est plafonné à 5000€ ! Vous seriez trop riche");
		}
		this.setSolde(getSolde() + montant);
	}

	private void debiterCompte(double montant) throws Exception {
		if (this.getSolde() - montant < 0) {
			throw new Exception("Le solde serait inférieur à 0 !");
		}
		this.setSolde(getSolde() - montant);
	}

	@SuppressWarnings("unused")
	private void commandePizza(Pizza pizza) throws Exception {
		this.debiterCompte(pizza.getPrice());
	}
	
	public String toString() {
		return "Client id = " + id + " nom = " + nom + " prenom = " + prenom + " solde = " + solde + "€.";
	}
	
	// Getters
	public int getId() {return id;}
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}
	public double getSolde() {return solde;}

	// Setters
	public void setId(int id) {this.id = id;}
	public void setNom(String nom) {this.nom = nom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public void setSolde(double solde) {this.solde = solde;}
}

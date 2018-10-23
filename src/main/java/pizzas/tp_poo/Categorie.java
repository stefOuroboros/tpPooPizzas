package pizzas.tp_poo;

public enum Categorie {
		VIANDE("viande"),
		POISSON("poisson"),
		CRUDITE("crudite"),
		FROMAGE("fromage"),
		AUTRE("autre");
		private String nom;
		private Categorie(String nom) {this.nom = nom;}
		public String getNom() {return this.nom;}
		public void setNom(String nom) {this.nom = nom;}
}


package personnages;

public class Humain {
	protected String nom;
	protected String boissonpref;
	protected int argent;
	
	public Humain(String nom, String boissonpref, int argent) {
		this.nom = nom;
		this.boissonpref = boissonpref;
		this.argent = argent;
	}

	public void direBonjour(){
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonpref);
	}
	
	public void boire(){
		parler("Mmmm, un bon verre de " + boissonpref + "! GLOUPS!");
	}
	
	public void acheter(String bien, int prix){
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
			
		}
	}
	
	public void gagnerArgent(int gain){
		argent += gain ;
	}
	
	public void perdreArgent(int perte){
		argent -= perte ;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte );
	}
	
	public String prendreParole(){
		return "("+nom+") - ";
	}
	
	public int getArgent(){
		return argent;
	}
	
	public String getNom(){
		return nom;
	}
}

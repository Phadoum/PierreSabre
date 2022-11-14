package personnages;

public class Humain {
	private String nom;
	private String boissonpref;
	private int argent;
	
	public Humain(String nom, String boissonpref, int argent) {
		this.nom = nom;
		this.boissonpref = boissonpref;
		this.argent = argent;
	}

	public void direBonjour(){
		System.out.println(parler()+"Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonpref);
	}
	
	public void boire(){
		System.out.println(parler()+"Mmmm, un bon verre de" + boissonpref + "!  GLOUPS !");
	}
	
	public void acheter(String bien, int prix){
		if (prix <= argent) {
			System.out.println(parler()+"J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			System.out.println(parler()+"Je n'ai plus que " + argent + " Je ne peux même pas m'offrir " + bien + " à " + prix + " sous." );
		}
	}
	
	public void gagnerArgent(int gain){
		argent += gain ;
	}
	
	public void perdreArgent(int perte){
		argent -= perte ;
	}
	
	public String parler(){
		return "("+nom+") - ";
	}
}

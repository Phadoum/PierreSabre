package personnages;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom, String boissonpref, int argent) {
		super(nom, boissonpref, argent);
		this.boissonpref = "th�";
	}
	
	public int seFaireExtorquer(){
		perdreArgent(argent);
		parler("J�ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie g�n�reux donateur!");
		gagnerArgent(argent);
	}
	

}

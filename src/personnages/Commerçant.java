package personnages;

public class Commerçant extends Humain{
	
	public Commerçant(String nom, String boissonpref, int argent) {
		super(nom, boissonpref, argent);
		this.boissonpref = "thé";
	}
	
	public int seFaireExtorquer(){
		perdreArgent(argent);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
	

}

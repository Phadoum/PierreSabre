package personnages;

public class Ronin extends Humain{
	protected int honneur = 1;
	public Ronin(String nom, String boissonpref, int argent) {
		super(nom, boissonpref, argent);
	}

	public void donner(Commerçant beneficiaire) {
		int don = (int) (argent*0.10);
		parler(beneficiaire.getNom()+ " prend ces " +don+ " sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		System.out.println("\nbim bam boum *bruit d'épée*\n");
		if(force >= adversaire.getRepu() ) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur+=1;
		}
		else {
			honneur -= 1;
			int argentperdu = argent;
			perdreArgent(argentperdu);
			adversaire.gagner(argentperdu);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
		
	}
}

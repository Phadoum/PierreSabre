package personnages;

public class Yakuza extends Humain{
	protected String clan;
	protected int repu = 0;
		
	
	public Yakuza(String nom, String boissonpref, int argent, String clan) {
		super(nom, boissonpref, argent);
		this.clan = clan;

	}
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int argentvoler = victime.getArgent();
		argent += argentvoler;
		victime.seFaireExtorquer();
		parler("J’ai piqué les "+ argentvoler +" sous de " +victime.getNom()+", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
		
	}
	public int perdre() {
		int argentperdu = argent ;
		perdreArgent(argent);
		repu -=1 ;
		parler("J’ai perdu mon duel et mes " +argentperdu+ " sous, snif... J'ai déshonoré le clan de " + clan);
		return argentperdu;
		
		
	}
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+ nom + " du clan de " + clan +"? Je l'ai dépouillé de ses "+ gain +" sous.");
		gagnerArgent(gain);
		repu += 1;
		}
	
	public int getRepu(){
		return repu;
	}
}

public class Corde extends Instrument{

	private double longueur;
	private double largeur;
	
	public Corde() {
		
	}
	
	public Corde(double longueur, double largeur) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
}

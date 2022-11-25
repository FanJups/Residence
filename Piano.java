public class Piano extends Corde{
	
	// ou faut-il etre final int nombreTouche = 88 ?
	private int nombreTouche = 88;
	
	public Piano() {
		
	}
	
	public Piano(int nombreTouche) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		super.getLongueur();
		super.getLargeur();
		this.nombreTouche = nombreTouche;
	}

	public int getNombreTouche() {
		return nombreTouche;
	}

	public void setNombreTouche(int nombreTouche) {
		this.nombreTouche = nombreTouche;
	}
}

public class PianoQueue extends Piano{

	private String[]taille = {"4/4", "1/2", "1/4", "Crapaud"};
	
	public PianoQueue() {
		
	}
	
	public PianoQueue(String[]taille) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		super.getLongueur();
		super.getLargeur();
		super.getNombreTouche();
		this.taille = taille;
	}

	public String[] getTaille() {
		return taille;
	}

	public void setTaille(String[] taille) {
		this.taille = taille;
	}
}

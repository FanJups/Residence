public class PianoDroit extends Piano{

	private String[]typeCorde = {"droite", "croisée"};
	private boolean etreDoteSilencieux;
	
	public PianoDroit(){
		
	}
	
	public PianoDroit(String[]typeCorde, boolean etreDoteSilencieux) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		super.getLongueur();
		super.getLargeur();
		super.getNombreTouche();
		this.typeCorde = typeCorde;
		this.etreDoteSilencieux = etreDoteSilencieux;
	}

	public String[] getTypeCorde() {
		return typeCorde;
	}

	public void setTypeCorde(String[] typeCorde) {
		this.typeCorde = typeCorde;
	}

	public boolean isEtreDoteSilencieux() {
		return etreDoteSilencieux;
	}

	public void setEtreDoteSilencieux(boolean etreDoteSilencieux) {
		this.etreDoteSilencieux = etreDoteSilencieux;
	}
	
	
}

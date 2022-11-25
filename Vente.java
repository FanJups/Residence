public class Vente extends Instrument{

	private String[]typeVent = {"flute", "clarinette", "haubois"};	
	
	public Vente() {
		
	}
	
	public Vente(String[]typeVent) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		this.typeVent = typeVent;
	}

	public String[] getTypeVent() {
		return typeVent;
	}

	public void setTypeVent(String[] typeVent) {
		this.typeVent = typeVent;
	}
}

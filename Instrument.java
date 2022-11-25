public abstract class Instrument {
	
	private String nom;
	private double prixAchat, prixVente;
	
	public Instrument() {
		
	}
	
	public Instrument(String nom, double prixAchat, double prixVente) {
		this.nom = nom;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	
	
	
}

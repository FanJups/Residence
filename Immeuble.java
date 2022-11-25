public class Immeuble extends Batiment {

	private int nombreAppartement;
	
	public Immeuble() {
		
	}
	
	public Immeuble(int nombreAppartement) {
		super.getAdresse();
		super.getSurfaceHabitale();
		this.nombreAppartement = nombreAppartement;
	}

	public int getNombreAppartement() {
		return nombreAppartement;
	}

	public void setNombreAppartement(int nombreAppartement) {
		this.nombreAppartement = nombreAppartement;
	}

}

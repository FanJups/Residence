public class Hotel extends Batiment {

	private int nombreChambre;
	
	public Hotel() {
		
	}
	
	public Hotel(int nombreChambre) {
		super.getAdresse();
		super.getSurfaceHabitale();
		this.nombreChambre = nombreChambre;
	}

	public int getNombreChambre() {
		return nombreChambre;
	}

	public void setNombreChambre(int nombreChambre) {
		this.nombreChambre = nombreChambre;
	}
	
	// if etoile == 5 on augmente le nombre de chambre et il y aura plusieurs suites et plusieurs piscines
	// if etoile == 4 il y aura une seule piscine et plusieurs spa
	public int etoileHotel(int nombreEtoile, int nombrePiscine) {
		if(nombreEtoile == 5) {
		  nombreChambre++;
		  // Comment exprimer cette idée : il y aura plusieurs suites et plusieurs piscines ?
		} else if(nombreEtoile == 4) {
		  nombrePiscine = 1;
		  // Comment exprimer cette idée : il y aura plusieurs spa ?
		} else {
		  System.out.println("Welcome but we're not the best lol");
		}
	   return 0;	
	}
	
}

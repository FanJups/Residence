public class Maison extends Batiment {
	private int nombrePiece;
	private double surfaceJardin;
	
	public Maison() {
		
	}
	
	public Maison(int nombrePiece, double surfaceJardin) {
		super.getAdresse();
		super.getSurfaceHabitale();
		this.nombrePiece = nombrePiece;
		this.surfaceJardin = surfaceJardin;
	}

	public int getNombrePiece() {
		return nombrePiece;
	}

	public void setNombrePiece(int nombrePiece) {
		this.nombrePiece = nombrePiece;
	}

	public double getSurfaceJardin() {
		return surfaceJardin;
	}

	public void setSurfaceJardin(double surfaceJardin) {
		this.surfaceJardin = surfaceJardin;
	}

}

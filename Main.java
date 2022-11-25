import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// L’application finale doit pouvoir une créer sur l’île de Mele-Mele une résidence contenant :
		
		
		// 3 immeubles, dont 2 à 10 appartements et 1 ayant 15 appartements ;
		Immeuble immeuble1, immeuble2, immeuble3;
		immeuble1 = new Immeuble();
		immeuble1.setNombreAppartement(10);
		immeuble2 = new Immeuble();
		immeuble2.setNombreAppartement(10);
		immeuble3 = new Immeuble();
		immeuble3.setNombreAppartement(15);
		
		
		// 5 maisons de superficies et nombres de pièces différentes ;
		Maison maison1 = new Maison();
		Maison maison2 = new Maison();
		Maison maison3 = new Maison();
		Maison maison4 = new Maison();
		Maison maison5 = new Maison();
		
		// Nombre min et max des pieces dans une maison
		int maxPiece = 10;
		int minPiece = 1;
		int randomP = (int)(Math.random() * (maxPiece - minPiece + 1) + minPiece); 
		
		// Nombre min et max des surfaces des maisons
		double maxSurface = 0.20;
		double minSurface = 200.0;
		double randomS = (double)(Math.random() * (maxSurface - minSurface + 1) + minSurface); 
		
		
		System.out.println("Maison 1 : ");
		maison1.setNombrePiece(randomP);
		System.out.println("Nombre de pièces : " + maison1.getNombrePiece());
		maison1.setSurfaceHabitale(randomS);
		System.out.println("Surface : " + maison1.getSurfaceHabitale());
		
		System.out.println("Maison 2 : ");
		maison2.setNombrePiece(randomP);
		System.out.println("Nombre de pièces : " + maison2.getNombrePiece());
		maison2.setSurfaceHabitale(randomS);
		System.out.println("Surface : " + maison2.getSurfaceHabitale());
		
		System.out.println("Maison 3 : ");
		maison3.setNombrePiece(randomP);
		System.out.println("Nombre de pièces : " + maison3.getNombrePiece());
		maison3.setSurfaceHabitale(randomS);
		System.out.println("Surface : " + maison3.getSurfaceHabitale());
		
		System.out.println("Maison 4 : ");
		maison4.setNombrePiece(randomP);
		System.out.println("Nombre de pièces : " + maison4.getNombrePiece());
		maison4.setSurfaceHabitale(randomS);
		System.out.println("Surface : " + maison4.getSurfaceHabitale());
		
		System.out.println("Maison 5 : ");
		maison5.setNombrePiece(randomP);
		System.out.println("Nombre de pièces : " + maison5.getNombrePiece());
		maison5.setSurfaceHabitale(randomS);
		System.out.println("Surface : " + maison5.getSurfaceHabitale());
		
		

		
		// 2 hôtels à 2 étoiles
		
		Hotel hotel1 = new Hotel();
		// ???
		
		Hotel hotel2 = new Hotel();
		// ???
		
		
		
		// 1 hôtel 5 étoiles ayant 3 piscine et 5 suites
		
		
		
		// 1 hôtel 4 étoiles ayant 7 SPAs
		
		
		
		// 1 magasin de divers instruments de musique
		
	}

}

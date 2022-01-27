package ma.education.tp1.introduction;

public class AccesHorsPackage {
	
	

	public static void main(String[] args) {
		Salle s = new Salle("Salle B");
		System.out.println(s.id + " " + s.nom);
		s.afficher(s);
		
	}
	
	

}

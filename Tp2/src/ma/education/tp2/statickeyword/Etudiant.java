package ma.education.tp2.statickeyword;

public class Etudiant {
	public long id;
	public String nom;
	public static int nbEtudiants;
	public Etudiant(long id, String nom,int nb) {
		super();
		this.id = id;
		this.nom = nom;
		nbEtudiants+=nb;
	}
	

}

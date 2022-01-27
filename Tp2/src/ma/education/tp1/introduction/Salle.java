package ma.education.tp1.introduction;

public class Salle {
	
	 long id;
	 String  nom;
	
	public Salle() {
	
	}

	
	public Salle(String nom) {
		this.nom = nom;
	}


	public Salle(long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public void afficher(Salle s) {
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id );
		System.out.println(nom );
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salle other = (Salle) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	

}

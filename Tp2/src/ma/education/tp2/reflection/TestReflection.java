package ma.education.tp2.reflection;

import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class<Salle> c = Salle.class;
		Method[] tab = c.getDeclaredMethods();
		for(Method m :tab) {
			System.out.println(m);
		}
		
		
		
		Salle o1 = new Salle();
		Salle o2 = new Salle("Salle Informatique");
		Salle o3 = new Salle(2, "Salle de cours");
		
	    System.out.println(o1.equals(o2));
		System.out.println( o2.equals(o3));
		
		
		
		
		

	}

}

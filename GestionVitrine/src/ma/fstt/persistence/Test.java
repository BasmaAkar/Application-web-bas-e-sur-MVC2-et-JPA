package ma.fstt.persistence;

import java.awt.Image;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("unit");
		
		EntityManager em = emf.createEntityManager();	
		
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}

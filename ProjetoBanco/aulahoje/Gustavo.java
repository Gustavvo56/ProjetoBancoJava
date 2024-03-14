package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulahoje.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa (null, "Gustavo Teixeira");
		
EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
EntityManager em = emf.createEntityManager();

		em.getTransaction() .begin();
		em.persist(p1);
		em.getTransaction() .commit();

		em.close();
		emf.close();
	}

}

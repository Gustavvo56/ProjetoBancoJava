package entidades;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulahoje.Pessoa;

public class Main {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa (null, "Gustavo Teixeira");
		Pessoa p2 = new Pessoa (null, "Maria Souza");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

				em.getTransaction() .begin();
				em.persist(p2);
				em.getTransaction() .commit();
				
				Pessoa busca1 = em.find(Pessoa.class, 1);
				Pessoa busca2 = em.find(Pessoa.class, 2);
				System.out.println(busca1);
				System.out.println(busca2);

				em.close();
				emf.close();

	}

}

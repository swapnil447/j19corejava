package com.symbiosis.ProjectJPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP");
		EntityManager em = emf.createEntityManager();

//		Actor a = new Actor(101, "Ritesh Deshmukh", "VED");
		Actor a1 = new Actor(102, "Akshay Kumar", "Filhall2");

		em.getTransaction().begin();
//		em.persist(a);
		em.persist(a1);
		em.getTransaction().commit();
		System.out.println("Saved Data");

		/*
		 * // finding an entity: Actor a = em.find(Actor.class, 101);
		 * System.out.println(a);
		 */
		// Insert Entity

	}
}

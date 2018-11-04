package com.mortaneous.jpa_inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("com.mortaneous.jpa-inheritance");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
		Bird b1 = new Bird("Eagle", Bird.CAN_FLY);
		Bird b2 = new Bird("Chicken", Bird.CANNOT_FLY);
		Mammal m1 = new Mammal("Lion", 4);
		Mammal m2 = new Mammal("Dolphin", 0);
		Mammal m3 = new Mammal("Ape", 2);
		Reptile r1 = new Reptile("Snake", Reptile.MOTION_SLITHER);
		Reptile r2 = new Reptile("Crocodile", Reptile.MOTION_CRAWL);
		
		save(b1);
		save(r1);
		save(m2);
		save(m1);
		save(r2);
		save(b2);
		save(m3);

		entityManager.close();
		entityManagerFactory.close();
	}

	public static void save(Animal animal) {
		entityManager.getTransaction().begin();
		entityManager.persist(animal);
		entityManager.getTransaction().commit();
	}
}

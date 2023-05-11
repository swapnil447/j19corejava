package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.symbiosis.model.Employee;

public class EmployeeController {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EMP");

		EntityManager em = emf.createEntityManager();

		// INSERT RECORD

		while (true) {

			Employee e1 = new Employee();
			e1.setName("Swapnil");
			e1.setSalary(25000);

			Employee e2 = new Employee();
			e2.setName("Santosh");
			e2.setSalary(27000);
//
			Employee e3 = new Employee();
			e3.setName("Ganesh");
			e3.setSalary(30000);
//
			em.getTransaction().begin();
//
			em.persist(e1);
			em.persist(e2);
			em.persist(e3);

			em.getTransaction().commit();
			System.out.println("Saved Data");

			Employee e4 = em.find(Employee.class, 1);
//
			System.out.println(e4);

//   DELETE RECORD
			
			em.getTransaction().begin();
			Employee e5 = em.find(Employee.class, 3);
			em.remove(e5);
			em.getTransaction().commit();

			System.out.println("Record Deleted Successfully");

// UPDATE RECORD

			Employee e6 = em.find(Employee.class, 4);
			e6.setName("Anand");

			em.getTransaction().begin();
			em.persist(e6);
			em.getTransaction().commit();

			System.out.println("Record Updated Successfully");

		}
	}
}

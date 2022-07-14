package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("jon");
		employee.setSalary(6000);
		employee.setDepartmentName("emp");
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("manisha");
		manager.setSalary(9000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
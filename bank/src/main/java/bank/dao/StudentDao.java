package bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bank.dto.Student;

public class StudentDao {
	
	EntityManager em=Persistence.createEntityManagerFactory("raju").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveStudent(Student student) {
		System.out.println("hello");
		et.begin();
		em.persist(student);
		et.commit();
		
	}

}

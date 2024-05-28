package onetoonemapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class mainclass {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("onetoone");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Person person=new Person();
	person.setName("sahana");
	person.setMobilenumber(9880815970l);
	
	PanCard panCard=new PanCard();
	panCard.setPannumber("SFTY7654");
	panCard.setName("sahana");
	panCard.setDob("20/06/2002");
   
	person.setPan(panCard);
	
	transaction.begin();
	manager.persist(person);
	manager.persist(panCard);
	transaction.commit();
}
}

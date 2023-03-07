package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.entitades.Embarques;

public class TesteRemocao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm2");
		EntityManager em = fabrica.createEntityManager();

		Embarques DataDesembarque = em.find(Embarques.class, 2);
		em.remove(DataDesembarque);
				
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			
		}		
		
		
		em.close();
		fabrica.close();

	}

}

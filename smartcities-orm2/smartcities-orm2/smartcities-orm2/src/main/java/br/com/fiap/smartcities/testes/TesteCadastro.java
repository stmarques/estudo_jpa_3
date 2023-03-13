package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.entitades.Embarques;

public class TesteCadastro {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm2");
		EntityManager em = fabrica.createEntityManager();

		Embarques NomeDestino = new Embarques();
		NomeDestino.setNomeDestino("Rio de Janeiro");
						
		try {
			em.persist(NomeDestino);
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

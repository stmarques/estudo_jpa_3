package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.entitades.Embarques;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm2");
		EntityManager em = fabrica.createEntityManager();

	
		Embarques NomeDestino = em.find(Embarques.class, 1);
		
		System.out.println(NomeDestino.getIdEmbarque() +" " +NomeDestino.getNomeDestino());
			
		em.close();
		fabrica.close();
		
	}
	
}

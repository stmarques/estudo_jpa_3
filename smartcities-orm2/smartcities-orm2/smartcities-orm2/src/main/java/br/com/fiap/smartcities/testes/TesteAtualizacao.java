package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.entitades.Embarques;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm2");
		EntityManager em = fabrica.createEntityManager();

		Embarques NomeDestino = em.find(Embarques.class, 3);
		
		System.out.println(NomeDestino.getIdEmbarque() +" " +NomeDestino.getNomeDestino());
		
		NomeDestino.setNomeDestino("Minas Gerais");
		em.getTransaction().begin();
		em.getTransaction().commit();
			
		em.close();
		fabrica.close();
		
	}

}
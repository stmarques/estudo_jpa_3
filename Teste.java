package br.com.fiap.smartcities.testes;

import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("smartcities-orm2").createEntityManager();

	}

}

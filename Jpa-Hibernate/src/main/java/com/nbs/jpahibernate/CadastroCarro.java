package com.nbs.jpahibernate;

import com.nbs.jpahibernate.model.Carro;
import com.nbs.jpahibernate.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroCarro {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = new Cliente();
        cliente.setId(1);
        Carro carro = new Carro();
        carro.setCliente(cliente);
        carro.setMarca("Ford");
        carro.setModel("Fusion");
        entityManager.persist(carro);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


    }
}

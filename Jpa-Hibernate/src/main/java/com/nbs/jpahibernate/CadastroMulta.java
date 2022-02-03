package com.nbs.jpahibernate;

import com.nbs.jpahibernate.model.Carro;
import com.nbs.jpahibernate.model.Cliente;
import com.nbs.jpahibernate.model.Multa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class CadastroMulta {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Carro carro = new Carro();
        carro.setId(1);
        Multa multa = new Multa();
        multa.setData(LocalDateTime.now());
        multa.setValor(100.00);
        multa.setCarro(carro);
        entityManager.persist(multa);
        System.out.println(carro);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

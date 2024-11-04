package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Livre touverLivre = em.find(Livre.class, 1);
        if (touverLivre != null) {
            System.out.println(touverLivre);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
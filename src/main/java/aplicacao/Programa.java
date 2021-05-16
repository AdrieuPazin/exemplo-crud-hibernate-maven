package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Adrieu H", "adrieu@adrieu.com");
		Pessoa p2 = new Pessoa(null, "Garcia H", "garcia@adrieu.com");
		Pessoa p3 = new Pessoa(null, "Pazin H", "pazin@adrieu.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* INSERÇÃO
		 * em.getTransaction().begin();
		 * 
		 * em.persist(p1); em.persist(p2); em.persist(p3);
		 * 
		 * 
		 * em.getTransaction().commit();
		 */
		
		/*====================================
		 * CONSULTA 
		 * Pessoa pc = em.find(Pessoa.class, 2);
		 */
		
		/*===================================
		 * ALTERAÇÃO
		 * Pessoa pupdate = em.find(Pessoa.class, 2); em.getTransaction().begin();
		 * 
		 * pupdate.setNome("ALTERANDO NOME");
		 * 
		 * 
		 * em.getTransaction().commit();
		 */
		
		
		/*====================================
		 * DELETAR
		 * Pessoa pDelete = em.find(Pessoa.class, 1);
		 * 
		 * em.getTransaction().begin();
		 * 
		 * em.remove(pDelete);
		 * 
		 * em.getTransaction().commit();
		 */
		
		
		System.out.println("OK");
	
	}

}

package com.curso.mercado.persistencia;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto>{
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("OracleHRPU");
	}
	@Override
	public void add(Producto entidad) {
		EntityManager em = factory.createEntityManager();
		//Departamento d = em.find(Departamento.class, 10);
		em.getTransaction().begin();
		em.persist(entidad);
		System.out.println("Se ha crado el empleado id" + entidad.getDescripcion());
		em.getTransaction().commit();
		
	}

	@Override
	public List<Producto> getAll() {
		EntityManager em = factory.createEntityManager();
		
		Query consulta = em.createQuery("SELECT * FROM Producto");
		List<Producto> lista = consulta.getResultList();
		return lista;
		
	

	}

	@Override
	public Producto getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

}

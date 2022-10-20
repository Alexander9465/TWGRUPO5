package com.bank.servicios;

import java.util.List;

import com.bank.entidades.Customer;
import com.bank.persistencia.BankInMemoryDao;
import com.bank.persistencia.GenericDAO;



public class BanckService {
	GenericDAO<Customer> dao = new BankInMemoryDao();
	
	public void darAltaUnproducto(Customer p) {
		// valida que p no es null
		//validar descripcion 
		//validar precio
		
		dao.add(p);
		
	}
	
	public List<Customer>  dameTodosLosClientes() {
		return dao.getAll();
	}
}

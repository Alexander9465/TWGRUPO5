package com.bank.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.bank.db.BaseDeDatosBank;
import com.bank.entidades.Customer;


public class BankInMemoryDao implements GenericDAO<Customer>{

	@Override
	public void add(Customer entidad) {
		BaseDeDatosBank.add(entidad.getFirstName(), entidad.getLastName());
		
	}

	@Override
	public List<Customer> getAll() {
		return new ArrayList( BaseDeDatosBank.getAll());
	}

	@Override
	public Customer getByID(String id) {
		// TODO Auto-generated method stub
		return BaseDeDatosBank.findById(id);
	}
	

}

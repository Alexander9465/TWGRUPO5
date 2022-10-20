package com.bank.persistencia;

import java.util.List;

import com.bank.entidades.Customer;

public interface GenericDAO<T> {
	public void add(T entidad);
	public List<T> getAll();
	public T getByID(String id);
	

}

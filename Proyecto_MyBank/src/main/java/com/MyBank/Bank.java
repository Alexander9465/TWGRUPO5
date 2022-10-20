package com.MyBank;

public class Bank {
	private Cliente[] clientes;
	private int numeroDeClientes;
	public Bank() {
		
		clientes = new Cliente[10];
		numeroDeClientes=0;
	}
	public void addCustomers(Cliente cliente) {
		clientes[numeroDeClientes]= cliente;
		numeroDeClientes++;
	}public void addCustomers1(String Nombre,String apellido) {
		clientes[numeroDeClientes]= new Cliente(Nombre,apellido);
		numeroDeClientes++;
	}
	public int getNumOfCustomer() {
		return this.numeroDeClientes;
		
	}
	public Cliente getCustmer(String nombre) {
		int i=0;
		Cliente a = new Cliente();
		while(this.clientes!=null && this.clientes[i]!=null ) {
			if(this.clientes[i].getNombre().equals(nombre)) {
				a= clientes[i];
			}
			i++;
		}
		return a;
		
	}
	public Cliente getCustmer(int nombre) {
		int i=0;
		Cliente a = new Cliente();
		while(this.clientes!=null && this.clientes[i]!=null ) {
			if(i==nombre-1) {
				a= clientes[i];
			}
			i++;
		}
		return a;
		
	}
	public Cliente[] getClientes() {
		return clientes;
	}
	
	

}

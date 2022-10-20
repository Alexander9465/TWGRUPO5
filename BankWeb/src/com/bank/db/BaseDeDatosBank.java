package com.bank.db;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.bank.entidades.Bank;
import com.bank.entidades.Customer;





public class BaseDeDatosBank {
	private static Map<Integer, Customer> banco;
	private static int contador = 3;


	// iniciar el static tablaProducto
	static {
		banco = new TreeMap<Integer,Customer>();
		banco.put(1, new Customer("Alexander","tupiza"));
		banco.put(2, new Customer("Joaquin","Sanchez"));
		banco.put(3, new Customer("Rocio","Lopez"));
		banco.put(4, new Customer("Roberto","Gomez"));
		banco.put(5, new Customer("Raul","Lopez"));
	}
	private BaseDeDatosBank() {}
	//crear los métodos para añadir, borrar, modificar solicitar por
		// id y solicitar todos
		
		
		public static void add(String nombre, String apellido) {
			int newId = ++contador;
			Customer newP = new Customer( nombre,apellido);
			banco.put(newId, newP);
		}
		
		
		public static Collection<Customer> getAll(){
			return banco.values();
		}
		
		public static Customer findById(String nombre) {
			return banco.get(nombre);
		}
		
		
		public static void update(Customer pModf) throws Exception {
			Customer p = findById(pModf.getFirstName());
			if(p == null) {
				throw new Exception("Producto no encontrado para se modificado");
			}
			banco.put(contador, pModf);
		}
		
		public static void delete(String id) {
			banco.remove(id);
		}
		
		public static int getContador() {
			return contador;
		}
		public static void main(String[] args) {
			BaseDeDatosBank banco = new BaseDeDatosBank();
			System.out.println(banco.getAll());
		}
		
		


}

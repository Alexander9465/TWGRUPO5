package com.MyBank.Pruebas;

import com.MyBank.Bank;
import com.MyBank.CheckingAccount;
import com.MyBank.Cliente;
import com.MyBank.Cuenta;

public class PruebaMyBank {
	public static void main(String[] args) {
		int cantidad = 200;
		int retirada = 150;
		
		Cuenta cuenta1 = new Cuenta(100);
		Cuenta cuenta3 = new Cuenta(600);
		Cuenta cuenta2 = new Cuenta(400);
		Cuenta[] cuenta4= {
				new Cuenta(700),
				new Cuenta(400),
				new Cuenta(800)
		};
		
		
		//Cliente cliente= new Cliente("Alexander", "Tupiza", cuenta1,cuenta2,cuenta3);
		Cliente cliente2= new Cliente("Alicia", "Suarez", cuenta4);
		//Cliente cliente3 = new Cliente("Almudena", "Ramirez", cuenta1);
		
		//Añadir Clientes
		Bank banco = new Bank();
		//banco.addCustomers(cliente);
		banco.addCustomers(cliente2);
		//banco.addCustomers(cliente3);
		banco.addCustomers1("Carlos","Garcia");
		System.out.println(banco.getNumOfCustomer());
		
		//buscar un cliente por nombre
		System.out.println(banco.getCustmer("Alicia"));
		System.out.println(banco.getCustmer(2));
		
		
		//
		CheckingAccount c3 = new CheckingAccount(cuenta1.getSaldo(),500);
		System.out.println(c3.retirada(500));
		
		 
		
		/*System.out.println("el saldo de su cuenta es :");
		System.out.println(cliente.getCuenta().getSaldo()+ " euros"+ "\n");
		
		System.out.println("Ha depositado " + cantidad + " euros");
		cliente.getCuenta().depositar(cantidad);
		System.out.println("Su saldo actual es: ");
		System.out.println(cliente.getCuenta().getSaldo()+ "\n");
		
		System.out.println("Ha retirado "+ retirada+ " euros");
		cliente.getCuenta().retirada(retirada);
		System.out.println("su saldo actual es: " +cliente.getCuenta().getSaldo() + "euros");
		*/
		
		
		
		
		
		
 }

}

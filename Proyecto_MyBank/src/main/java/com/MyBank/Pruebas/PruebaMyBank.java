package com.MyBank.Pruebas;

import com.MyBank.Cliente;
import com.MyBank.Cuenta;

public class PruebaMyBank {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(100);
		Cliente cliente = new Cliente("Alexander", "Tupiza", cuenta1);
		System.out.println("el saldo de su cuenta es :");
		System.out.println(cliente.getCuenta().getSaldo());
		
		cliente.getCuenta().depositar(200);
		System.out.println("Su saldo actual es: ");
		System.out.println(cliente.getCuenta().getSaldo());
		cliente.getCuenta().retirada(150);
		System.out.println(cliente.getCuenta().getSaldo());
		
		
 }

}

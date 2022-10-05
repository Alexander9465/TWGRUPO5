package com.MyBank.Pruebas;

import com.MyBank.Cliente;
import com.MyBank.Cuenta;

public class PruebaMyBank {
	public static void main(String[] args) {
		int cantidad = 200;
		int retirada = 150;
		Cuenta cuenta1 = new Cuenta(100);
		Cliente cliente = new Cliente("Alexander", "Tupiza", cuenta1);
		System.out.println("el saldo de su cuenta es :");
		System.out.println(cliente.getCuenta().getSaldo());
		System.out.println("Ha depositado " + cantidad);
		cliente.getCuenta().depositar(cantidad);
		System.out.println("Su saldo actual es: ");
		System.out.println(cliente.getCuenta().getSaldo());
		System.out.println("Ha retirado "+ retirada);
		cliente.getCuenta().retirada(retirada);
		System.out.println("su saldo actual es:" +cliente.getCuenta().getSaldo());
		
		
 }

}

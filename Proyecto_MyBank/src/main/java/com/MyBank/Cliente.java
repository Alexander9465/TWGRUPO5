package com.MyBank;



public class Cliente {
	private String nombre;
	private String apellido;
	private Cuenta[] cuenta;

	public Cliente() {

	}

	public Cliente(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Cliente(String nombre, String apellido, Cuenta[] cuenta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = new Cuenta[10];
	}

	public int numCuentas(Cuenta[] cuenta) {
		int cont = 0;
		for (int i = 0; i < this.cuenta.length; i++) {
			if (cuenta[i] != null) {
				cont++;
			}
		}
		return cont;
	}

	public Cuenta  getCuenta(int c) {
		Cuenta C = new Cuenta(0);
		for(int i =0;i<this.cuenta.length;i++) {
			if(i==c ){
				C = this.cuenta[i];
			}
		}
		return C;
	}

	public void setCuenta(Cuenta[] cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		int cont = 0;
		for (int i = 0; i < this.cuenta.length; i++) {
			if (cuenta[i] != null) {
				cont++;
			}
		}
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", Numero de cuentas =" + cont + "cuentas"
				+ "]";
	}
	public static void main(String[] args) {
		Cliente cuenta1 = new Cliente("Alexander","Tupiza");
		cuenta1.toString();
	}
}

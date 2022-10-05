package com.MyBank;

public class Cliente {
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	
	public Cliente(String nombre, String apellido,Cuenta cuenta) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	

}

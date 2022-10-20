package com.MyBank;

public class Cuenta {

	protected double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;

	}
	

	public double getSaldo() {
		return saldo;
	}

	public boolean depositar(double cantidad) {
		boolean resultado = true;
		if (cantidad < 0)
			throw new RuntimeException("La cantidad no puede ser menor que cero");
		this.saldo += cantidad;

		return resultado;
	}

	public boolean retirada(double cantidad) {
		boolean resultado = false;
		if (this.saldo > cantidad) {
			System.out.println("la operacion ha ido con exito ");
			resultado = true;
			this.saldo -= cantidad;
		} else {
			System.out.println("No tienes suficiente saldo ");
		}
		return resultado;

	}


	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	

}

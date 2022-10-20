package com.MyBank;

public class CheckingAccount extends Cuenta{
	
	private double overdraft;
	public CheckingAccount(double saldo, double overdraft) {
		super(saldo);
		this.overdraft = overdraft;
		
	}
	public boolean retirada(double amt) {
		System.out.println("Vas a retiar " + amt + "euros \n"+
				"Tienes un saldo de: "+  this.saldo +" euros\n"+
				"Tines un limite de: " + this.overdraft+ " euros");
		boolean res = false;
		double diferencia= 0;
		if(amt>this.saldo && overdraft >0) {
			diferencia= amt-this.saldo;
			overdraft-=diferencia;
			//System.out.println(overdraft);
		}
		if(overdraft>=0) {
			res = true;
		}
		System.out.println(
				"Tienes un saldo de: "+  this.saldo +" euros\n"+
				"Tines un limite de: " + this.overdraft+ " euros");
		return res ;
	}
	public void mostrar() {
		System.out.println(getSaldo());
	}
}

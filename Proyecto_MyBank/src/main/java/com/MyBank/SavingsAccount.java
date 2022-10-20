package com.MyBank;

public class SavingsAccount extends Cuenta{
private double intereses;
	
	public SavingsAccount(double saldo, double intereses) {
		super(saldo);
		this.intereses= intereses;
	}
}

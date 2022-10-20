package com.bank.entidades;

import java.io.Serializable;

public class Bank implements Serializable{
  private static Customer[] customers;
  private static int        numberOfCustomers;

  static {
    customers = new Customer[10];
    numberOfCustomers = 0;
  }

  public Bank() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l) {
    int i = numberOfCustomers++;
    customers[i] = new Customer(f, l);
  }
  public static int getNumOfCustomers() {
    return numberOfCustomers;
  }
  public static Customer getCustomer(int customer_index) {
    return customers[customer_index];
  }
}

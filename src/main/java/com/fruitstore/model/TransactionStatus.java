package com.fruitstore.model;

public enum TransactionStatus
{
  SUCCESS("Your purchase is successful!"),
  STOCKFINISH("Sorry, we don't have enough stock for your request");

  private final String name;
  TransactionStatus(String status) {
    name = status;
  }

  public String toString() {
    return name;
  }
}

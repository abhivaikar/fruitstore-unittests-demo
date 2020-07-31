package com.fruitstore.mainapp;

import com.fruitstore.model.Product;
import com.fruitstore.model.TransactionStatus;

public class Customer {

  public String purchase(Store store, Product product, int purchaseQuantity) {
    int currentStock = store.getStock(product);
    if (currentStock < purchaseQuantity) {
      return TransactionStatus.STOCKFINISH.toString();
    } else {
      store.updateStock(product, currentStock - purchaseQuantity);
      return TransactionStatus.SUCCESS.toString();
    }
  }
}
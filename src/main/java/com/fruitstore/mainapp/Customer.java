package com.fruitstore.mainapp;

import com.fruitstore.model.Product;
import com.fruitstore.model.TransactionStatus;

public class Customer {

  public String purchase(Store store, Product product, int purchaseQuantity) {
    if (store.getStock(product) < purchaseQuantity) {
      return TransactionStatus.STOCKFINISH.toString();
    } else {
      store.updateStock(product, store.getStock(product) - purchaseQuantity);
      return TransactionStatus.SUCCESS.toString();
    }
  }
}

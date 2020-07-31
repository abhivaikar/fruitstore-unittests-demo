package com.fruitstore.mainapp;

import com.fruitstore.model.Product;
import java.util.HashMap;
import java.util.Map;

public class Store {

  private Map<Product, Integer> stock = null;

  public Store() {
    stock = new HashMap<Product, Integer>();
  }

  public void addStock(Product product, int quantity) {
    stock.put(product, quantity);
  }

  public int getStock(Product product) {
    return stock.get(product);
  }

  public void updateStock(Product product, int updateQuantity) {
    stock.put(product, updateQuantity);
  }
}

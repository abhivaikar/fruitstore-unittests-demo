import com.fruitstore.mainapp.Customer;
import com.fruitstore.mainapp.Store;
import com.fruitstore.model.Product;

public class AppRunner {

  public static void main(String []args){
    Store store = new Store();
    store.addStock(Product.Apple, 10);
    Customer customer = new Customer();
    System.out.println(customer.purchase(store, Product.Apple, 0));
  }
}

import com.fruitstore.mainapp.Customer;
import com.fruitstore.mainapp.Store;
import com.fruitstore.model.Product;
import org.junit.Assert;
import org.junit.Test;

public class StorePurchaseTest {

  @Test
  public void testStorePurchaseSuccess() {
    // Arrange
    Store store = new Store();
    store.addStock(Product.Apple, 10);
    Customer customer = new Customer();
    // Act
    String purchaseMessage = customer.purchase(store, Product.Apple, 5);

    // Assert
    Assert.assertEquals("Your purchase is successful!", purchaseMessage);
    Assert.assertEquals(5, store.getStock(Product.Apple));
  }

  @Test
  public void testStorePurchaseFailed() {
    // Arrange
    Store store = new Store();
    store.addStock(Product.Apple, 10);
    Customer customer = new Customer();
    // Act
    String purchaseMessage = customer.purchase(store, Product.Apple, 15);

    // Assert
    Assert.assertEquals("Sorry, we don't have enough stock for your request", purchaseMessage);
    Assert.assertEquals(10, store.getStock(Product.Apple));
  }
}

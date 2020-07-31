import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fruitstore.mainapp.Customer;
import com.fruitstore.mainapp.Store;
import com.fruitstore.model.Product;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

  @Test
  public void testStorePurchaseSuccess() {
    // Arrange
    Store store = mock(Store.class);//Ideally should mock an interface instead of implementation
    Customer customer = new Customer();

    when(store.getStock(Product.Apple)).thenReturn(10);

    // Act
    String purchaseMessage = customer.purchase(store, Product.Apple, 5);

    // Assert
    Assert.assertEquals("Your purchase is successful!", purchaseMessage);
    verify(store, times(1)).getStock(any(Product.class));//Verifying interaction
    verify(store, times(1)).updateStock(any(Product.class), anyInt());//Verifying interaction
  }

  @Test
  public void testStorePurchaseFailed() {
    // Arrange
    Store store = mock(Store.class);
    Customer customer = new Customer();

    when(store.getStock(Product.Apple)).thenReturn(10);

    // Act
    String purchaseMessage = customer.purchase(store, Product.Apple, 15);

    // Assert
    Assert.assertEquals("Sorry, we don't have enough stock for your request", purchaseMessage);
    verify(store, times(1)).getStock(any(Product.class));//Verifying interaction
    verify(store, never()).updateStock(any(Product.class), anyInt());//Verifying interaction
  }
}

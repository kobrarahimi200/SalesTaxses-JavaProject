import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSales {

    @Test
    public void testNumOfProducts() {
        Sales sale = new Sales();
        sale.addProductsToList();
        assertEquals(9, sale.getProducts().size());
    };

    @Test
    public void testaddThreeProducts() {
        Product product1 = new Product("book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product("music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product("chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product3);
        cart.addToCart(product2);
        assertEquals(3, cart.getShoppingCart().size());
    };

    @Test
    public void testCalcTotalTax() {
        Product product1 = new Product("book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product("music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product("chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product3);
        cart.addToCart(product2);
        assertEquals(1.50, cart.calcTotalTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice() {
        Product product1 = new Product("book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product("music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product("chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product3);
        cart.addToCart(product2);
        assertEquals(29.83, cart.getPriceWithTax(), 0.01);
    };
   
}

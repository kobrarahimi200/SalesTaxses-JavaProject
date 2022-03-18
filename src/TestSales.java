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
    public void testCalcTotalTax_ForInput1() {
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
    @Test
    public void testCalcTotalPrice_Book() {
        Product product = new Product("book", 12.49, false, ItemType.BOOK);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product);
        assertEquals(12.49, cart.getPriceWithTax(), 0.01);
    };
    @Test
    public void testCalcTotalPrice_ImportedBook() {
        Product product = new Product("book", 12.49, true, ItemType.BOOK);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product);
        assertEquals(13.15, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_ImportedChocolate() {
        Product product = new Product("box of chocolates", 10.00, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product);
        assertEquals(10.50, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcSalesTax_ForInput2() {
        Product product1 = new Product("box of chocholate", 10.00, true, ItemType.FOOD);
        Product product2 = new Product("bottle of perfume", 47.50, true, ItemType.OTHERS);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(7.65, cart.calcTotalTax() , 0.01);
    };

    @Test
    public void testCalcSalesTax_ForInput3() {
        Product product1 = new Product("bottle of perfume", 27.99, true, ItemType.OTHERS);
        Product product2 = new Product("bottle of perfume", 18.99, false, ItemType.OTHERS);
        Product product3 = new Product("headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS);
        Product product4 = new Product("box of chocholate", 11.25, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product3);
        cart.addToCart(product4);
        assertEquals(6.70, cart.calcTotalTax() , 0.01);
    };

    @Test
    public void testCacTotalPrice_ForInput3() {
        Product product1 = new Product("bottle of perfume", 27.99, true, ItemType.OTHERS);
        Product product2 = new Product("bottle of perfume", 18.99, false, ItemType.OTHERS);
        Product product3 = new Product("headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS);
        Product product4 = new Product("box of chocholate", 11.25, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product3);
        cart.addToCart(product4);
        assertEquals(74.68, cart.getPriceWithTax() , 0.01);
    };

    @Test
    public void testCalcTax_ImportedTextile() {
        Product product = new Product("textiles", 32.40, true, ItemType.TEXTILE);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product);
        assertEquals(4.9, cart.calcTotalTax(), 0.01);
    };
    
    @Test
    public void testCalcTotalPrice_ImportedTextile() {
        Product product = new Product("textiles", 32.40, true, ItemType.TEXTILE);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product);
        assertEquals(37.3, cart.getPriceWithTax(), 0.01);
    };
}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSales {

    @Test
    public void testNumOfProducts() {
        Sales sale = new Sales();
        sale.addProductsToList();
        assertEquals(10, sale.getProducts().size());
    };

    @Test
    public void testaddThreeProducts() {
        Product product1 = new Product(1, "book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product(3, "chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product3, 1);
        cart.addToCart(product2, 1);
        assertEquals(3, cart.getShoppingCart().size());
    };

    @Test
    public void testCalcTotalTax_ForInput1() {
        Product product1 = new Product(1, "book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product(3, "chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product3, 1);
        cart.addToCart(product2, 1);
        assertEquals(1.50, cart.calcTotalTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice() {
        Product product1 = new Product(1, "book", 12.49, false, ItemType.BOOK);
        Product product2 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        Product product3 = new Product(3, "chocholate", 0.85, false, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product3, 1);
        cart.addToCart(product2, 1);
        assertEquals(29.83, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_Book() {
        Product product = new Product(1, "book", 12.49, false, ItemType.BOOK);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 1);
        assertEquals(12.49, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_ImportedBook() {
        Product product = new Product(1, "book", 12.49, true, ItemType.BOOK);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 1);
        assertEquals(13.15, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_ImportedChocolate() {
        Product product = new Product(4, "box of chocolates", 10.00, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 1);
        assertEquals(10.50, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcSalesTax_ForInput2() {
        Product product1 = new Product(4, "box of chocholate", 10.00, true, ItemType.FOOD);
        Product product2 = new Product(5, "bottle of perfume", 47.50, true, ItemType.OTHERS);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product2, 1);
        assertEquals(7.65, cart.calcTotalTax(), 0.01);
    };

    @Test
    public void testCalcSalesTax_ForInput3() {
        Product product1 = new Product(6, "bottle of perfume", 27.99, true, ItemType.OTHERS);
        Product product2 = new Product(7, "bottle of perfume", 18.99, false, ItemType.OTHERS);
        Product product3 = new Product(8, "headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS);
        Product product4 = new Product(10, "box of chocholate", 11.25, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product2, 1);
        cart.addToCart(product3, 1);
        cart.addToCart(product4, 1);
        assertEquals(6.70, cart.calcTotalTax(), 0.01);
    };

    @Test
    public void testCacTotalPrice_ForInput3() {
        Product product1 = new Product(6, "bottle of perfume", 27.99, true, ItemType.OTHERS);
        Product product2 = new Product(7, "bottle of perfume", 18.99, false, ItemType.OTHERS);
        Product product3 = new Product(8, "headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS);
        Product product4 = new Product(10, "box of chocholate", 11.25, true, ItemType.FOOD);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 1);
        cart.addToCart(product2, 1);
        cart.addToCart(product3, 1);
        cart.addToCart(product4, 1);
        assertEquals(74.68, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTax_ImportedTextile() {
        Product product = new Product(9, "textiles", 32.40, true, ItemType.TEXTILE);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 1);
        assertEquals(4.9, cart.calcTotalTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_ImportedTextile() {
        Product product = new Product(9, "textiles", 32.40, true, ItemType.TEXTILE);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 1);
        assertEquals(37.3, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_ThreeProducts() {
        Product product = new Product(9, "textiles", 32.40, true, ItemType.TEXTILE);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product, 3);
        assertEquals(111.89, cart.getPriceWithTax(), 0.01);
    };

    @Test
    public void testCalcTotalPrice_FourProducts() {
        Product product1 = new Product(9, "bootle of perfume", 18.99, true, ItemType.OTHERS);
        Product product2 = new Product(1, "book", 12.49, false, ItemType.BOOK);
        Product product3 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 2);
        cart.addToCart(product2, 3);
        cart.addToCart(product3, 1);
        assertEquals(97.63, cart.getPriceWithTax(), 0.01);
    };
    @Test
    public void testCalcTotalPrice_FiveProducts() {
        Product product1 = new Product(9, "bootle of perfume", 18.99, true, ItemType.OTHERS);
        Product product2 = new Product(1, "book", 12.49, false, ItemType.BOOK);
        Product product3 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        Product product4 = new Product(2, "music CD", 14.99, false, ItemType.OTHERS);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(product1, 2);
        cart.addToCart(product2, 3);
        cart.addToCart(product3, 1);
        cart.addToCart(product4, 5);
        assertEquals(180.08, cart.getPriceWithTax(), 0.01);
    };
}

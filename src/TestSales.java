import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSales {

    @Test
    public void testNumOfProducts() {
        Sales sale = new Sales();
        sale.addProductsToList();
        assertEquals(9, sale.getProducts().size());
    };
   
    
}

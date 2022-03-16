import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<Product> shoppingCart = new LinkedList<>();

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    protected void addToCart(Product item) {
        this.shoppingCart.add(item);
    }

    /**
     * calculate the base price without tax
     * 
     * @return total base price
     */
    protected Double calBasePrice() {
        Double totalPrice = 0.0;

        for (Product product : shoppingCart) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    /**
     * calculate the tax for each product
     * 
     * @return
     */
    protected Double calcTotalTax() {

        Double totalTax = 0.0;
        for (Product product : shoppingCart) {
            if (product != null) {
                totalTax += product.productTax();
            }
        }
        return totalTax;
    }

    /**
     * summing up the base price and tax price and retuen it as total price
     * 
     * @return
     */
    protected Double getPriceWithTax() {
        return calBasePrice() + calcTotalTax();
    }
}

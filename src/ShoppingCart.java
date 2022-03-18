import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<ProductInCart> shoppingCart = new LinkedList<>();

    public List<ProductInCart> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<ProductInCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    protected void addToCart(Product item, int numberOfProducts) {

        ProductInCart product = new ProductInCart(numberOfProducts, item);

        this.shoppingCart.add(product);
        
    }

    /**
     * calculate the base price without tax
     * 
     * @return total base price
     */
    protected double calBasePrice() {
        double totalPrice = 0.0;

        for (ProductInCart product : shoppingCart) {
            if (product != null) {
                totalPrice += product.getProduct().getPrice() * product.getNumberOfProducts();
            }
        }
        return totalPrice;
    }

    /**
     * calculate the total tax for the products which are added to the shopping
     * carts.
     * 
     * @return total tax od all products in the cart
     */
    protected double calcTotalTax() {

        double totalTax = 0.0;
        for (ProductInCart product : shoppingCart) {
            if (product != null) {
                totalTax += product.getProduct().productTax() * product.getNumberOfProducts();
            }
        }
        return totalTax;
    }

    /**
     * summing up the base price and tax price and retuen it as total price
     * 
     * @return
     */
    protected double getPriceWithTax() {
        return calBasePrice() + calcTotalTax();
    }

 
}

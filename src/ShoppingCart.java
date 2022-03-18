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
    protected double calBasePrice() {
        double totalPrice = 0.0;

        for (Product product : shoppingCart) {
            if (product != null) {
                totalPrice += product.getPrice();
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
        for (Product product : shoppingCart) {
            if (product != null) {
                totalTax += product.productTax();
            }
        }
        return roundUp(totalTax);
    }

    /**
     * summing up the base price and tax price and retuen it as total price
     * 
     * @return
     */
    protected double getPriceWithTax() {
        return calBasePrice() + calcTotalTax();
    }

    /**
     * round up the given number
     * 
     * @param num
     * @return
     */
    public double roundUp(double num) {
        return (Math.ceil(num * 20) / 20);
    }
}

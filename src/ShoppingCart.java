import java.util.LinkedList;
import java.util.List;

/**
 * shopping cart of the user. Calculate the tax and the total sales price for
 * the shopping cart.
 */
public class ShoppingCart {

    private List<ProductInCart> shoppingCart = new LinkedList<>(); // list of all selected items(products) which are
                                                                   // added to the cart

    public List<ProductInCart> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<ProductInCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * This method is receiving a product which user chose and an amount of product
     * that
     * user wants to buy. Then it checks if the item is already in the shopping cart
     * list or not. If the item is in the list, the amount will be added to the same
     * product and
     * if it is a new item, the productInCart type will be added to the list.
     * 
     * @param item             Product that user wants to buy
     * @param numberOfProducts amount of item to be purchased.
     */
    protected void addToCart(Product item, int numberOfProducts) {
        ProductInCart foundProduct = listContainsProduct(item.getId());
        if (foundProduct != null) {
            foundProduct.setNumberOfProducts(foundProduct.getNumberOfProducts() + numberOfProducts);
        } else {
            ProductInCart product = new ProductInCart(numberOfProducts, item);
            this.shoppingCart.add(product);
        }
    }

    /**
     * This method is checking if the chosen item is already in the shopping cart.
     * If it is a new item return null and if the item is in the list, it return the
     * productInCart type.
     * 
     * @param item is Product in Cart
     * @return null for new item and ProductInCart object if it is in the list.
     */
    private ProductInCart listContainsProduct(int itemId) {

        for (ProductInCart product : this.shoppingCart) {
            if (product.getProduct().getId() == itemId) {
                return product;
            }
        }
        return null;
    }

    /**
     * calculate the base price without tax. checks all products in the cart and if it is not null
     * then multiply the price for each product in number of each product.
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
     * cart. checks if  products in the shopping cart is not null then 
     *  multiply the the tax of each product in number of each product.
     * 
     * @return total tax of all products in the cart
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
     * @return double calculated based price plus calculated tax
     */
    protected double getPriceWithTax() {
        return calBasePrice() + calcTotalTax();
    }

}

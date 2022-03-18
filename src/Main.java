import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Sales allProducts = new Sales();
        allProducts.addProductsToList();
        int enteredNumer = 0;
        List<Integer> selectedItems = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        showAllProducts(allProducts.getProducts());
        System.out.println();
        System.out.println(" please enter your product id between 1 to " + allProducts.getProducts().size());

        enteredNumer = scan.nextInt();

        while (enteredNumer != 0) {
            if (enteredNumer >= 1 && enteredNumer <= allProducts.getProducts().size()) {
                selectedItems.add(enteredNumer);
                cart.addToCart(allProducts.getProducts().get(enteredNumer - 1));
            } else {
                System.out.println(" please enter your product id between 1 to " + allProducts.getProducts().size() +
                        " and 0 is to exit");
            }

            enteredNumer = scan.nextInt();
        }

        scan.close(); // finishing the order

        System.out.println("Your Shopping Cart :  " + cart.getShoppingCart().size());
        showShoppingCart(cart);

    }

    /**
     * show all products including an id
     * 
     * @param products is the given products list
     */
    private static void showAllProducts(List<Product> products) {

        System.out.println("List of Products: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + " " + products.get(i).toString());
        }
    }

    /**
     * shows the final list of selected Items to the user
     * 
     * @param cartItem      is the list of all products
     */
    private static void showShoppingCart(ShoppingCart cartItem) {

      

        for (int i = 0; i < cartItem.getShoppingCart().size(); i++) {
                    System.out.println(cartItem.getShoppingCart().get(i).getName() + ": " +
                            String.format("%.2f", cartItem.getShoppingCart().get(i).getTotalPrice()));
        }
        System.out.println("Sales Taxes: " + String.format("%.2f",cartItem.calcTotalTax()));
        System.out.println("Total: " +String.format("%.2f", cartItem.getPriceWithTax()));
    
    }
}

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
        showAllProducts(allProducts.getProducts());
        System.out.println();
        System.out.println(" please enter your product id between 1 to " + allProducts.getProducts().size());
        // This method reads the number provided using keyboard

        enteredNumer = scan.nextInt();

        while (enteredNumer != 0) {
            if (enteredNumer >= 1 && enteredNumer < allProducts.getProducts().size()) {
                selectedItems.add(enteredNumer);
            } else {
                System.out.println(" please enter your product id between 1 to " + allProducts.getProducts().size());
            }

            enteredNumer = scan.nextInt();
        }

        scan.close();

        showShoppingCart(selectedItems, allProducts.getProducts());

        System.out.println("Your Shopping Cart :  ");
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
     * @param selectedItems is the id list of the selected item
     * @param products      is the list of all products
     */
    private static void showShoppingCart(List<Integer> selectedItems, List<Product> products) {
        for (Integer id : selectedItems) {
            for (int i = 0; i < products.size(); i++) {
                if (id == (i + 1)) {
                    System.out.println(products.get(i).toString());
                }
            }
        }
    }
}

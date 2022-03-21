import java.util.LinkedList;
import java.util.List;

/**
 * this class is responsible for the product list. It creates a list that contains the list of
 * all products.
 */
public class Sales {

    private List<Product> products = new LinkedList<>();// list of all available products

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * adding some items in different types to the list.
     */
    protected void addProductsToList() {
        this.products.add(new Product(1, "book", 12.49, false, ItemType.BOOK));
        this.products.add(new Product(2, "music CD", 14.99, false, ItemType.OTHERS));
        this.products.add(new Product(3, "chocolate bar", 0.85, false, ItemType.FOOD));
        this.products.add(new Product(4, "box of chocolates", 10.00, true, ItemType.FOOD));
        this.products.add(new Product(5, "bottle of perfume", 47.50, true, ItemType.OTHERS));
        this.products.add(new Product(6, "packet of headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS));
        this.products.add(new Product(7, "bottle of perfume", 27.99, true, ItemType.OTHERS));
        this.products.add(new Product(8, "bottle of perfume", 18.99, false, ItemType.OTHERS));
        this.products.add(new Product(9, "textile", 32.40, true, ItemType.TEXTILE));
        this.products.add(new Product(10, "box of chocolates", 11.25, true, ItemType.FOOD));
    }
}

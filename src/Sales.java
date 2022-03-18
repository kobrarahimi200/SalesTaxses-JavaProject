import java.util.LinkedList;
import java.util.List;

public class Sales {

    private List<Product> products = new LinkedList<>();
    
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    protected void addProductsToList(){
        this.products.add(new Product("book", 12.49, false, ItemType.BOOK));
        this.products.add(new Product("music CD", 14.99, false, ItemType.OTHERS));
        this.products.add(new Product("chocolate bar", 0.85, false, ItemType.FOOD));
        this.products.add(new Product("box of chocolates", 10.00, true, ItemType.FOOD));
        this.products.add(new Product("bottle of perfume", 47.50, true, ItemType.OTHERS));
        this.products.add(new Product("packet of headache pills", 9.75, false, ItemType.MEDICAL_PRODUCTS));
        this.products.add(new Product("bottle of perfume", 27.99, true, ItemType.OTHERS));
        this.products.add(new Product("bottle of perfume", 18.99, false, ItemType.OTHERS));
        this.products.add(new Product("textile", 32.40, true, ItemType.TEXTILE));
        this.products.add(new Product("box of chocolates", 11.25, true, ItemType.FOOD));
    }
}

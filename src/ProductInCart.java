
public class ProductInCart{
    private int numberOfProducts;
    private Product product;

    
    
    public ProductInCart(int numberOfProducts, Product product) {
        this.numberOfProducts = numberOfProducts;
        this.product = product;
    }


    public int getNumberOfProducts() {
        return numberOfProducts;
    }


    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }


    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }


    protected double taxForProducts(){
        double tax = 0.0;

        tax = numberOfProducts * this.product.productTax();

        return tax;
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "> "+numberOfProducts +" "+ product.toString();
    }
    
}
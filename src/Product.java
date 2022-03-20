/**
 * class of the product with all required attributes
 */
public class Product {

    private int id; // identifer of the product
    private String name; // name of the product
    private Double price; // price of the product
    private boolean isImported;// if the product is imported the value is set to true
    private ItemType type; // product type

    public Product(int id, String name, Double price, boolean isImported, ItemType type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean isImported) {
        this.isImported = isImported;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    /**
     * calculate the tax for each product.checks if the type is not food, meedical
     * products and books,
     * theese items do not have tax, other products have 10% tax.
     * if the product is imported then tax of 5% is added to the price of that.
     * 
     * @return only the tax of the product
     */
    protected double productTax() {
        double tax = 0.0;

        if (this.type != ItemType.FOOD && this.type != ItemType.BOOK && this.type != ItemType.MEDICAL_PRODUCTS) {
            tax = (this.price * 10 / 100);
        }
        if (isImported) {

            tax += (this.price * 5 / 100);
        }
        return roundUp(tax);
    }

    /**
     * summing up the price of the product plus tax for that
     * 
     * @return total price for the product
     */
    protected double getTotalPrice() {
        return this.price + productTax();
    }

    /**
     * convert to string.
     */
    public String toString() {
        String results = "";

        if (this.isImported) {
            results += "imported ";
        }
        results += this.getName() + " : " + this.getPrice();

        return results;

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

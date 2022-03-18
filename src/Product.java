public class Product {
 
    private String name; // name of the product
    private Double price; // price of the product
    private boolean isImported;// if the product is imported the value is set to true
    private ItemType type; // product type

    public Product(String name, Double price, boolean isImported, ItemType type) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.type = type;
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
     * checks if the product is not food, book and medical products, then add 10%
     * tax to the price.
     * then checks if the product is imported then add 5% tax to the price of that.
     * 
     * @return price of the product
     */
    protected Double addTaxToPrice() {
        Double price = 0.0;
        if (this.type != ItemType.FOOD && this.type != ItemType.BOOK && this.type != ItemType.MEDICAL_PRODUCTS) {
            price = this.price + (this.price * 10 / 100);
        } else {
            price = this.price;
        }
        if (this.isImported) {
            price += price * (5 / 100);
        }
        return price;
    }

    /**
     * calculate the tax for each product
     * 
     * @return the tax of the product
     */
    protected double productTax() {
        double tax = 0.0;

        if (this.type != ItemType.FOOD && this.type != ItemType.BOOK && this.type != ItemType.MEDICAL_PRODUCTS) {
            tax = (this.price * 10 / 100);
        }
        System.out.println("is imported "+isImported);
        if(isImported) {
            System.out.println("inside is imported!" + (this.price * 5 / 100));
        
            tax += (this.price * 5 / 100);
        }
        System.out.println("tax in product " + tax+ " price " + this.price);
        return tax;
    }

    /**
     * convert to string.
     */
    public String toString(){
        String results = "";

        if(this.isImported){ 
            results += "imported ";
        }
        results += this.getName() + " at " + this.getPrice(); 

    return results;

    }

}

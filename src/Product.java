public class Product {
    private String name;
    private Double price;
    private boolean isImported;
    private  ItemType type;

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

    protected Double addTaxToPrice(){
        Double price =0.0;
        if(this.type != ItemType.FOOD && this.type != ItemType.BOOK && this.type != ItemType.MEDICAL_PRODUCTS ){
            price = this.price + (this.price * 10 /100);
        }else{
            price = this.price;
        }
        if(this.isImported){
            price += price * (5/100);
        }
        return price;
    }
    protected double productTax(){
        double tax = 0.0;

        if(this.type != ItemType.FOOD && this.type != ItemType.BOOK && this.type != ItemType.MEDICAL_PRODUCTS ){
            tax =  (this.price * 10 /100);
        }

        if(this.isImported){
            tax += price * (5/100);
        }

        return tax;
    }

}

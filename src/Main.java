public class Main {
    public static void main(String[] args) throws Exception {
        Sales sale = new Sales();
        sale.addProductsToList();
        System.out.println("Hello, World!" + sale.getProducts().size());
    }
}

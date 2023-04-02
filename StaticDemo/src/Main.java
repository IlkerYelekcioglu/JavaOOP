public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 100;
        product.name =  "Mouse";

        manager.Add(product );

        DatabaseHelper.Connection.createConnection();
    }
}
public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.setName("Laptop");
    product.setId(1) ;
    product.setDescription("Lenovo Laptop");
    product.setPrice(14000);
    product.setStockAmount(5);

    ProductManager productManager = new ProductManager();
    productManager.Add(product);

    }
}
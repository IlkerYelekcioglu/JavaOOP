public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapıcı blok çalışto");
    }
    public static boolean isValid(Product product){
    if(product.price > 0 && !product.name.isEmpty()){
        return true;
    }else {
        return false;
    }
    }
    public void bisey(){


    }
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}

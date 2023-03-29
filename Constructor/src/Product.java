public class Product {
    public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod){
        //Buna overloading denir.
        System.out.println("Yapıcı blok çalıştı.");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.renk=renk;
        this.kod=kod;


    }
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId(){
        return id;
    }

}

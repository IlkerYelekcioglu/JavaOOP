public class Main {
    public static void main(String[] args) {
        //Polymorphism in interfaceler ile uygulanmış hali
     CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
     customerManager.add();
    }
}
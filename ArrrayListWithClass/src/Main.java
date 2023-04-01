import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<Customer>();
        Customer ilker = new Customer(1,"İlker","Yelekçioğlu");
    customers.add(ilker);
        customers.add(new Customer(2,"Ali","Çınar"));
        customers.add(new Customer(3,"Erdal","Bakkal"));

        customers.remove(ilker);
        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}
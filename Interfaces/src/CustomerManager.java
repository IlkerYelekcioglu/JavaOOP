public class CustomerManager {
    private ICustomerDal customerDal;
     public CustomerManager(ICustomerDal iCustomerDal){
         this.customerDal = iCustomerDal;
     }
    public void add(){
         customerDal.Add();
    }
}

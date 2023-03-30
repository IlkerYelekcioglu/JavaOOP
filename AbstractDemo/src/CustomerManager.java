public class CustomerManager {
    //Base sınıfı strateji görevini görür.
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        //Burada biz oracleDatabaseManager a bağımlıyız.
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
          databaseManager.getData();
    }
}

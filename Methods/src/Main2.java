public class Main2 {
    public static void main(String[] args){
          String mesaj = "Bugün hava çok güzel";
          String yeniMesaj = mesaj.substring(0,2);
          System.out.println(yeniMesaj);
          String yeniMesaj2= sehirVer();
          int sayi= topla(13,17);
          int toplam = topla2(3,6,7,5,4,1,9,8,2);
          System.out.println(toplam);
    }
    public static void ekle(){
     System.out.println("Eklendi");
    }
    public static void sil(){
     System.out.println("Silindi");
    }
    public static void guncelle(){
    System.out.println("Güncellendi");
    }
    public static int topla(int num1,int num2){
        return 13;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "İzmir";
    }
}

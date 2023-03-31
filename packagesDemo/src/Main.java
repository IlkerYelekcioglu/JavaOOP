import matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adınız:");

        String isim = sc.nextLine();

        System.out.println("Merhaba " + isim);

        DortIslem dortIslem= new DortIslem();
        dortIslem.topla(9,213);
        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma);
    }
}
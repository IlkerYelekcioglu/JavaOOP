import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Izmir");
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Denizli");
        cities.remove("Ankara");
        Collections.sort(cities);
        for(String s:cities){
            System.out.println(s);
        }
    }
}
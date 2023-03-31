import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
         numbers.add(10);
         numbers.add(13);
         numbers.add("İzmir");

        //System.out.println(numbers.size());

//        numbers.set(2,100);
//        numbers.remove(0);
//        numbers.clear();
//        System.out.println(numbers.get(2));

        for(Object i:numbers){
            System.out.println(i);
        }

    }
}
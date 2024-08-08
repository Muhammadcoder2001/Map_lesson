package Map_lesson;

import java.util.HashMap;
import java.util.Map;

public class HomeTAsk1 {

    public static void main(String[] args) {

        HashMap<String , Integer> hashmap = new HashMap<>();

        hashmap.put("Ali", 10);
        hashmap.put("Vali", 15);
        hashmap.put("Toshmat", 5);
        for (Map.Entry m : hashmap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Size of Hashmap is equal to " + hashmap.size());
    }
}

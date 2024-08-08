package Map_lesson;

import java.util.HashMap;
import java.util.Map;

public class HomeTask2 {

    public static void main(String[] args) {
        HashMap<String, Integer>  hashmap2 = new HashMap<>();
        HashMap <String , Integer>  hashmap = new HashMap<>();

        hashmap.put("Olma", 12000);
        hashmap.put("Nok", 25000);
        hashmap.put("SHaftoli", 10000);
        hashmap.put("Tarvuz", 15000);

        hashmap2.put("Qovun", 7500);
        hashmap2.put("Anor", 5000);
        hashmap2.put("Behi", 8000);
        hashmap2.put("Handalak", 10000);

        hashmap.putAll(hashmap2);
        System.out.println(hashmap);


        for (Map.Entry element : hashmap.entrySet()){
            System.out.println("Value->" + element.getValue());

        }
        hashmap.clear();
        System.out.println(hashmap);
    }
}

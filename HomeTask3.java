package Map_lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeTask3 {

    public static void main(String[] args) {

        Map<Integer, String> mapOne = new HashMap<>();

        mapOne.put(10, "Ali");
        mapOne.put(15, "Vali");
        mapOne.put(5, "Toshmat");
        mapOne.put(42 , "Abdulloh");

        HashMap <Integer, String> cloneMap = (HashMap<Integer, String>) ((HashMap<Integer, String>) mapOne).clone();
        System.out.println(cloneMap);
        for(Map.Entry element : cloneMap.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());

        }
        ArrayList<String> array = new ArrayList<>(mapOne.values());
        System.out.println(array);


    }
}

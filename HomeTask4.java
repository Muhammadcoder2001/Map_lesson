package Map_lesson;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HomeTask4 {

    public static void main(String[] args) {

        TreeMap <String, Integer> mapOne = new TreeMap<>();

        mapOne.put("Apple", 12000);
        mapOne.put("Orange", 11000);
        mapOne.put("Pear", 17000);
        mapOne.put("Watermelon", 12000);

        System.out.println("First key is " + mapOne.firstKey() + " \nLAst key is " + mapOne.lastKey());

        TreeMap <String, Integer> mapTwo = new TreeMap<>(Comparator.reverseOrder());
        mapTwo.put("Apple", 12000);
        mapTwo.put("Orange", 11000);
        mapTwo.put("Pear", 17000);
        mapTwo.put("Watermelon", 12000);

        for (Map.Entry element : mapTwo.entrySet()){
            System.out.println(element.getKey());
        }
    }
}

package Map_lesson;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomeTAsk5 {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(14, "Islombek");
        map.put(7, "Abdulloh");
        map.put(39, "Habibullo");
        map.put(2, "Xafizullo");

        System.out.println(map.firstKey() + " " + map.get(map.firstKey()));
        System.out.println(map);
        TreeSet <Integer> nums = new TreeSet<>();

        for (Map.Entry element: map.entrySet()){
            nums.add((Integer) element.getKey());
        }

        System.out.println(nums);
        map.clear();
        System.out.println(map);
    }
}

package numbers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(10,"строка 10");
        map.put(9,"строка 9");
        map.put(8,"строка 8");
        map.put(7,"строка 7");
        map.put(6,"строка 6");
        map.put(1,"строка 1");
        map.put(2,"строка 2");
        map.put(3,"строка 3");
        map.put(4,"строка 4");
        map.put(5,"строка 5");

        for (Map.Entry<Integer,String> pair: map.entrySet()) {
            System.out.println(pair.getKey()+" : " + pair.getValue());
        }
    }
}

package numbers;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args){

        Test map = new Test();

        map.add("str5",5);
        map.add("str6",7);
        map.add("str7",15);
        map.add("str5",10);
        //map.add("str7",15);

        map.printTest();
    }

    public static class Test{

        private final Map<String,Integer> map = new HashMap<>();

        public void add(String key, Integer val){
            if((!map.containsKey(key)) || (map.containsKey(key) && !map.containsValue(val))){
                map.put(key,val);
            }
            else{
                throw new RuntimeException("Такая пара 'ключ-значение' уже есть в коллекции!");
            }
        }

        public void printTest(){
            for (Map.Entry<String, Integer> pair: map.entrySet()) {
                System.out.println(pair.getKey() + " --> " + pair.getValue());
            }
        }
    }
}

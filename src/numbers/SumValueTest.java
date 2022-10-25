package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumValueTest {

    public static void main(String[] args) {

        HashMap<String, List<Integer>> firstMap = new HashMap<>();

        for(int i = 0; i < 5;i++){
            StringBuilder str = new StringBuilder("String ");
            str.append(i+1);
            firstMap.put(String.valueOf(str),generateRandom());
        }

        for (Map.Entry<String, List<Integer>> pair: firstMap.entrySet()) {
            System.out.println("Изначальная коллекция: "+ pair.getKey() + " --> "+ pair.getValue().toString());
        }

        Map<String,Integer> secondMap = new HashMap<>();

        for (String k:firstMap.keySet()){
            List<Integer> l = firstMap.get(k);
            int sum = 0;
            for (int n = 0; n < l.size();n++){
                sum = sum + l.get(n);
            }
            secondMap.put(k,sum);
        }

        for (Map.Entry<String, Integer> pair: secondMap.entrySet()) {
            System.out.println("Измененная коллекция: "+ pair.getKey() + " --> "+ pair.getValue().toString());
        }

    }
    public static List<Integer> generateRandom(){
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < 3; j++){
            int a = (int) (Math.random() * 1000);
            list.add(a);
        }
        return list;
    }

}

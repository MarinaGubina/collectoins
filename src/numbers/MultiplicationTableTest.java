package numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiplicationTableTest {

    public static void main(String[] args){
        getExample();
    }

    public static void getExample(){
        Set<String> example = new HashSet<>();

        for(int i = 2; i < 10; i++){
            for(int j = i; j < 10; j++){
                String[] ex = {j + " * " + i,i + " * " + j};
                example.add(ex[(int) Math.round(Math.random())]);
            }
        }

        Iterator<String> it = example.iterator();
        int count = 1;
        while (it.hasNext() && count < 16){
            count++;
            System.out.println(it.next());
        }
    }
}

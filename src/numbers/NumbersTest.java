package numbers;

import java.util.*;

public class NumbersTest {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<Integer>();

        for (int i = 0 ; i < 20; i++){
            numbers.add((int) (Math.random()*1000));
        }

        Iterator<Integer> n = numbers.iterator();
        while (n.hasNext()){
            int number = n.next();
            if(number % 2 == 0){
                System.out.println(number);
            }
            else {
                n.remove();}
        }
    }
}

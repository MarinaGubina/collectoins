package passport;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Integer,Passport> map = new HashMap<>();

    public static void main(String[] args){

        Passport human1 = new Passport(123456,"Ivan","Ivanov","Ivanovich",1998);
        Passport human2 = new Passport(654321,"Tanya","Petrova",1987);
        Passport human3 = new Passport(123456,"Petr","Ivanov","Petrovich",2000);

        addPassport(human1);
        addPassport(human2);
        addPassport(human3);
        System.out.println(getPassport(654321));
        System.out.println(getPassport(123456));
    }

    public static void addPassport(Passport p){
        map.put(p.getPassportNumber(),p);
    }

    public static Passport getPassport(int numb){
        return map.get(numb);
    }
}

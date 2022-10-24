package numbers;

import java.util.HashMap;

public class PhoneDirectoryTest {

    public static void main(String[] args){

        HashMap<String,String> phoneBook = new HashMap<>();

        phoneBook.put("Петрова Ирина", "+7-900-123-45-45");
        phoneBook.put("Иванов Иван", "+7-950 9878734");
        phoneBook.put("Скворцова Наталья", "+7 999 341 98 34");
        phoneBook.put("Пустяков Павел", "+7 951 789 34 01");
        phoneBook.put("Трусова Елена", "+7-951-941-93-45");
        phoneBook.put("Павлов Алексей", "+7-973-45-39");
        phoneBook.put("Зубов Михаил", "+7-955-359-45-82");
        phoneBook.put("Ростов Стас", "8-950-096-72-39");
        phoneBook.put("Котова Настя", "+7-900-358-45-76");
        phoneBook.put("Петрова Антонина", "+7 964 677 34 99");
        phoneBook.put("Перов Сергей", "+7-950 346 87 91");
        phoneBook.put("Ходякова Таня", "+7 999 459 09 90");
        phoneBook.put("Зайцева Светлана", "+7 951 346 77 88");
        phoneBook.put("Зотов Максим", "+7-951-735-93-49");
        phoneBook.put("Созонов Данил", "+7-955-48-39");
        phoneBook.put("Суворова Анна", "+7-955-349-45-82");
        phoneBook.put("Копосов Илья", "8-950-096-66-39");
        phoneBook.put("Петухова Настя", "+7-900-567-45-83");
        phoneBook.put("Туманов Матвей", "+7-900-325-45-76");
        phoneBook.put("Котова Дарья", "+7-900-358-67-10");

        for (String name:phoneBook.keySet()) {

            String key = name.toString();
            String value = phoneBook.get(name).toString();
            System.out.println(key + ": " + value);
        }

    }

}

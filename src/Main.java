import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Домашнее задание 1. задание 1
        ShoppingList shoppingList = new ShoppingList();

        Product banana = new Product("Банан",80,1);
        Product tomato = new Product("Помидор",180,0.8);
        Product cucumber = new Product("Огурец",70,1);
        Product pepper = new Product("Перец",300,0.5);
        Product apple = new Product("Яблоко",100,2);

        /*shoppingList.add(banana);
        shoppingList.add(tomato);
        shoppingList.add(cucumber);
        shoppingList.add(pepper);
        shoppingList.add(banana);

        shoppingList.getProduct();

        shoppingList.remove(pepper);

        shoppingList.getProduct();

        shoppingList.contains(apple);
        shoppingList.contains(tomato);*/

        // Домашнее задание 2. задание 1

        ShoppingList vegetables = new ShoppingList();
        vegetables.add(cucumber);
        vegetables.add(tomato);

        Recipe salad = new Recipe("Салат",vegetables);
        salad.getSumCost();

        Recipe soup = new Recipe("Суп",vegetables);

        ShoppingList fruits = new ShoppingList();
        fruits.add(banana);
        fruits.add(apple);
        Recipe smoothie = new Recipe("Смузи",fruits);

        BookOfRecipe bookOfRecipe  = new BookOfRecipe();
        bookOfRecipe.add(salad);
        bookOfRecipe.add(soup);
        bookOfRecipe.add(smoothie);
        bookOfRecipe.getRecipe();
        bookOfRecipe.add(salad);
    }
}
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShoppingList {
    private Map<Product, Integer> shoppingList;
    private int quantity;

    public ShoppingList() {
        shoppingList = new HashMap<>();
    }

    public void add(Product product,int quantity){
        if(shoppingList.containsKey(product)){
            throw new RuntimeException(product.getName()+" - данный продукт уже есть в списке!");
        }
        else {
            if(quantity < 1 ){
                shoppingList.put(product,1);
            }
            else{
                shoppingList.put(product,quantity);
            }
        }
    }

    public void contains(Product product){
        if(shoppingList.containsKey(product) == true){
            System.out.println(product.getName() + " - уже есть в списке");
        }
        else {
            System.out.println(product.getName() + " - не найден в списке");
        }
    }

    public void remove(Product product){
        shoppingList.remove(product);
        System.out.println(product.getName() + " - удален из списка");
    }

    public void getProduct(){
                for (Product product:shoppingList.keySet()) {
            System.out.println(product.toString());
        }
    }

    public double getSumCost() {
        double sumCost = 0;
        for (Product p : shoppingList.keySet()) {
            sumCost = sumCost + p.getCost()* shoppingList.get(p);
        }
        return sumCost;
    }

}

import java.util.HashSet;
import java.util.Set;

public class ShoppingList {
    private  Set<Product> shoppingList;

    public ShoppingList() {
        shoppingList = new HashSet<Product>();
    }

    public void add(Product product){
        if(shoppingList.contains(product)){
            throw new RuntimeException(product.getName()+" - данный продукт уже есть в списке!");
        }
        else {
            shoppingList.add(product);
        }
    }

    public void contains(Product product){
        if(shoppingList.contains(product) == true){
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
                for (Product product:shoppingList) {
            System.out.println(product.toString());
        }
    }

}

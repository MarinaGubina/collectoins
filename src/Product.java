import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    private double weight;

    public Product(String name, double cost, double weight) {
        if(name == null || name.isEmpty() || name.isBlank()){
            throw new NullPointerException("Заполните карточку товара полностью!");
        }
        else{
            this.name = name;}
        if(cost <=0){
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        else {
            this.cost = cost;
        }
        if(weight <=0){
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        else{
            this.weight = weight;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return name == product.name && cost == product.cost && weight == product.weight;
    }

    @Override
    public String toString() {
        return "{" +
                "название: '" + name + '\'' +
                ", стоимость: " + cost +
                ", вес: " + weight +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add (T fruit){
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void add (List<T> fruits){
        this.fruits.addAll(fruits);
    }

    public float getWeights(){
        if (fruits.size() > 0){
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0.0f;
    }
    public boolean compare(Box<? extends Fruit> other) {
        return Math.abs(getWeights() - other.getWeights()) > 0.0001;
    }

    public void merge (Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

}

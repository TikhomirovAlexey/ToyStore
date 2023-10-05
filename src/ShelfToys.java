import java.util.ArrayList;
import java.util.List;

public class ShelfToys {

    String name;
    List<Toy> toys;

    public ShelfToys(String name) {
        this.toys = new ArrayList<>();
        this.name = name;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public int getCountToys() {
        return toys.size();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }
}

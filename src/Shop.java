import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<ShelfToys> shelfToys;

    public Shop() {
        this.shelfToys = new ArrayList<>();
    }

    public List<ShelfToys> getShelfToys() {
        return shelfToys;
    }

    @Override
    public String toString() {
        String str = "";
        for (ShelfToys shelfToy: shelfToys) {
            for (Toy toy: shelfToy.getToys()) {
                str += toy.getCompany() + " - " + toy.getName() + " - " + toy.getId();
                str += "\n";
            }
        }
        return str;
    }
}

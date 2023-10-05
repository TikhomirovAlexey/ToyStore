import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffle {

    private static Random random = new Random();

    private List<ShelfToys> shelfToys;

    private List<Character> probability = new ArrayList<>();

    public Raffle(Shop shop) {
        this.shelfToys = shop.getShelfToys();
        madeProbability();
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

    /**
     * Метод создает частоту выпадения игрушек посредством манипуляций с id игрушки
     */
    private void madeProbability(){
        for (ShelfToys shelfToy: shelfToys) {
            for (Toy toy: shelfToy.getToys()) {
                probability.add(toy.getId().charAt(0));
            }
        }
    }

    public List<Character> getProbability() {
        return probability;
    }

    /**
     * Метод проводит одну игтерацию лотереи
     */
    public void raffleToys(){
        if(!(probability.isEmpty())){
            int tmpInt = random.nextInt(probability.size());
            for (ShelfToys shelfToy: shelfToys) {
                if(!(shelfToy.getToys().isEmpty())) {
                    if(shelfToy.getToys().get(0).getId().charAt(0) == probability.get(tmpInt)){
                        String fileName = "raffle.txt";
                        try (FileWriter writer = new FileWriter(fileName, true)) {
                            writer.write("Вы выиграли : "+ shelfToy.getToys().get(0).getCompany() +
                                    " " + shelfToy.getToys().get(0).getName() +
                                    " " + shelfToy.getToys().get(0).getId() + "\n");
                            writer.flush();
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        shelfToy.getToys().remove(shelfToy.getToys().get(0));
                        probability.remove(tmpInt);
                        break;
                    }
                }

            }
        } else System.out.println("Лотерея окончена!");

    }
}

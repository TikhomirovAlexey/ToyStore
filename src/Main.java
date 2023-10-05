// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShelfToys lego = new ShelfToys("Lego");
        lego.addToy(new Toy("101", "lego", "OOO Toys"));
        lego.addToy(new Toy("102", "lego", "OOO Toys"));

        ShelfToys robots = new ShelfToys("Robots");
        robots.addToy(new Toy("201", "robot Bob", "OOO Robots"));
        robots.addToy(new Toy("202", "robot Bob", "OOO Robots"));

        ShelfToys dolls = new ShelfToys("Dolls");
        dolls.addToy(new Toy("301", "doll Barby", "OOO Dolls"));
        dolls.addToy(new Toy("302", "doll Barby", "OOO Dolls"));
        dolls.addToy(new Toy("303", "doll Barby", "OOO Dolls"));
        dolls.addToy(new Toy("304", "doll Barby", "OOO Dolls"));
        dolls.addToy(new Toy("305", "doll Barby", "OOO Dolls"));
        dolls.addToy(new Toy("306", "doll Barby", "OOO Dolls"));

        Shop shop = new Shop();
        shop.getShelfToys().add(lego);
        shop.getShelfToys().add(robots);
        shop.getShelfToys().add(dolls);


        Raffle raffle = new Raffle(shop);

        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();
        raffle.raffleToys();

    }
}
public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 5),
            new Cat("Murzik", 10),
            new Cat("Whiskers", 7)
        };

        Plate plate = new Plate(20);

        plate.info();

        plate.addFood(10);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is full? " + cat.isFull());
        }

        plate.info();
    }
}
public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (!isFull && plate != null) {
            if (plate.decreaseFood(appetite)) {
                isFull = true;
                System.out.println(name + " ate " + appetite + " units of food.");
            } else {
                System.out.println(name + " couldn't eat. Not enough food in the plate.");
            }
        } else {
            System.out.println(name + " is already full or the plate is missing.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
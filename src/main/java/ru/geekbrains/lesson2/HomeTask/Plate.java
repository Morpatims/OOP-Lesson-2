public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
            return true;
        } else {
            System.out.println("Not enough food in the plate.");
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Added " + amount + " units of food to the plate.");
        } else {
            System.out.println("Invalid amount of food to add.");
        }
    }
}
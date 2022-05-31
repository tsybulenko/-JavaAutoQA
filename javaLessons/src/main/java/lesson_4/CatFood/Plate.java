package lesson_4.CatFood;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
 public void addFood(int add) {
  food+=add;

    }
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        return true;}
        else {
            food = n;
            return false;
        }
    }
    public void info () {
        System.out.println("plate: " + food);
    }
}

package lesson_4.CatFood;



public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    public Cat(String name, int appetit){
       this.name = name;
        this.appetite = appetit;
        this.isFull = false;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void eat( Plate p) {
        isFull = p.decreaseFood(appetite);
    }

}

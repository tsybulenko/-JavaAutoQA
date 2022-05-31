package lesson_4.CatFood;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();


        Cat catArr[] = {
                new Cat("ki", 10),
                new Cat("ki", 10),
                new Cat("ki", 10),
                new Cat("ki", 10),
                new Cat("ki", 10)
        };

        plate.addFood(50);
        for (Cat cat: catArr) {
            cat.eat(plate);
            System.out.println(cat.getIsFull());
        }
        


        plate.info();
    }
}

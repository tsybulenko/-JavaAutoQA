package lesson_5;


public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherOrangeBox = new Box<>();
//        System.out.println("Вес яблок " + appleBox.getWeight());
//        System.out.println("Вес апельсинов " + orangeBox.getWeight());
//        System.out.println(appleBox.compare(orangeBox));
//        orangeBox.anotherBox(anotherOrangeBox);
    }

}

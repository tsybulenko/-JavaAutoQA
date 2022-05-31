package lesson_4;

public class Animals {
    public String animal;
    public String name;
    public int maxRunLength;
    public int maxSwimLength;




    public Animals(String name) {
        this.name = name;

    }

    public void run(int length) {
        if (this.maxRunLength >= length) System.out.println(animal + " " + this.name + " пробежал " + length + " м.");
        else System.out.println(animal + " " + this.name + " не добежит!");
    }

    public void swim(int length) {
        if (this.maxSwimLength >= length) System.out.println(animal + " " + this.name + " проплыл " + length + " м.");
        else System.out.println(animal + " " + this.name + " не доплывет!");
    }

}

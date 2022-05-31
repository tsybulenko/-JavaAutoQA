package lesson_4;

public class Cat extends Animals {

   public Cat(String name){
       super(name);
       this.maxRunLength = 200;
       this.animal = "Кот";

   }

    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}



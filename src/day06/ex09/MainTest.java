package day06.ex09;

public class MainTest {
  public static void main(String[] args) {
    //Dog, Cat
    Dog dog = new Dog("리트리버", 3, "green");
    dog.sound();
    dog.sleep();
    dog.run();

    Cat cat = new Cat("페르시안",4,"사료");
    cat.sound();
    cat.sleep();
    cat.eat();
  }
}

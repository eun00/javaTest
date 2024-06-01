package day06.ex04;

import day06.ex02.Ani;

public class AnimalTest {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.name="Buddy";
    dog.age = 5;
    dog.address ="인천";
    dog.favFood ="개껌";

    dog.run();
    dog.eat();
    dog.info();


    Animal cat = new Animal();
    cat.name = "고양이";
    cat.age = 3;
    cat.address="경기";
    cat.favFood="사료";

    cat.eat();
    cat.info();





  }
}

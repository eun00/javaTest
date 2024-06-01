package day06.ex09;

public class Cat extends  Animal {
  String food;
  Cat( String name, int age, String  food){
    super(name, age );
    this.food = food;
  }
  void eat(){
    System.out.println(name+"은(는) 음식은"+food+"입니다.");
  }
}

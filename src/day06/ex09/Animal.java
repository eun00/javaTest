package day06.ex09;

//최상위 클래스 공통
public class Animal {
  //  필드
  String name;
  int age;
  // 생성자함수
  Animal(String name, int age){
    this.name = name ;
    this.age = age;
  }
  // 메소드
  void sound() {
    System.out.println(name+"은(는) 소리는 냅니다.");
  }
  void sleep() {
    System.out.println(name+"은(는) 잠을 잔다");
  }
}

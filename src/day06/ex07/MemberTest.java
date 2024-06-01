package day06.ex07;

import day06.ex03.Person;

public class MemberTest {
  public static void main(String[] args) {
      Member member1 = new Member(); // 객체생성 - 메모리할당 - 생성자호출
      Member member2 = new Member("강호동"); // 객체생성 - 메모리할당 - 생성자호출
      Member member3 = new Member("김고은", 23);
      Member member4 = new Member("김고은", 23, "010-1111-2222");
      // 객체생성 - 메모리할당 - 생성자호출

    Member[] member= new Member[]{member1,member2,member3, member4};
    //향상된 for
    for( Member m:member) {
      System.out.println("-------------------");
      System.out.println("이름:" + m.name );
      System.out.println("나이:" + m.age);
      System.out.println("연락처:" + m.tel);
    }

    System.out.println("-------------------");
    System.out.println("인스턴스(객체) 실행");
  }
}

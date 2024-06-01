package day06.ex08;

import day06.ex07.Member;

public class CarTest {
  public static void main(String[] args) {
     // 배열처리
      Car car1 = new Car();
      Car car2 = new Car("테슬라");
      Car car3 = new Car("테슬라" ,"green");
      Car car4 = new Car("테슬라" ,"green" , 100);

    Car[] car= new Car[]{car1,car2,car3, car4};
      for( Car c:car) {
        c.display();
      }//end for

  }
}

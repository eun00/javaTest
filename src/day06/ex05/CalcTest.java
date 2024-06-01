package day06.ex05;

public class CalcTest {
  public static void main(String[] args) {
    Calc calc = new Calc();
    calc.calcon();
    int result1 = calc.sum(10,20);
    System.out.println("두수의 합:" + result1);

    double result2 = calc.div(75,22);
    System.out.println("두수의 몫:" + result2);
    calc.calcoff();
  }
}

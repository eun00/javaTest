package day06.ex05;

public class Calc {
    public void calcon(){
      System.out.println("계산기 시작");
      System.out.println("-----------------");
    }
    //리턴값이 존재하는 않는다( 반환값이 없다)
    public  void calcoff() {
      System.out.println("--------------");
      System.out.println("계산기 끝");
    }

    public  int sum (int x, int y) {
      int result = x + y;
      return result;
    }

  public  double div (int x, int y) {
    double result = (double)x /(double) y;
    return result;
  }

}

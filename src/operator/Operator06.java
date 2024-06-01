package operator;

public class Operator06 {
  public static void main(String[] args) {
    //논리연산자  && , || , !
    int a =10 , b = 20 , c = 30;
    System.out.println( a > b && c > b ); // false && true
    System.out.println( a < b && c > b ); // true && true
    System.out.println( a > b || c > b ); //false || true => true
    System.out.println( a < b || c > b ); // true || true => true
    System.out.println( !true );
    System.out.println( !false );
  }
}

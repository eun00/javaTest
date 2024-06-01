package operator;

public class Operator07 {
  public static void main(String[] args) {
    //증감연산자
    int x =1 , y = 1;
    x++; // x = x + 1, x += 1
    ++x;
    x++;
    ++x;
    --x; // x = x -1 , x -= 1
    System.out.println(x);

    int a = ++y + 10 ;
    System.out.println(a);
    System.out.println(y);
    x = 1;
    int b = x++ + 10;
    System.out.println(b);
    System.out.println(x);
  }
}

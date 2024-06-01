package function;

/*
  메서드 오버라이딩
  같은 메서드이름 , 다른 매개변수
  다른 자료형의 값들은 같은 성질의 작업을 정의 할때
  같은메서드를 여러개 정의할수 있다 ( 매개변수를 다르게 )
  단 반환타입은 인정하지 않는다
 */

public class Ex14 {
    public static int add(int x , int y) {
      return x + y;
    }

  public static int add(int x , int y, int z ) {
    return x + y + z ;
  }

  public static void main(String[] args) {
      int z1 = add(10,20);
      System.out.println( z1 );
      int z2 = add(10,20, 50);
      System.out.println( z2 );
  }
}

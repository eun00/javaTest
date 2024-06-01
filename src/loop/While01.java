package loop;

public class While01 {
  public static void main(String[] args) {
    // 0 ~ 10 까지 출력
    int x = 0; // 시작
    while ( x <= 10 ) { // 조건식
      System.out.print( x + ", " ); // 실행
      x++; // 증감식
    }
    System.out.println();
    System.out.println("=======================");
    // 0 ~ 20 까지 짝수 y
    // 0 ~ 20 까지 홀수 z

    int y = 0 ;
    while ( y <= 20 ) {
      if( y % 2 == 0) { // if( y % 2 == 1),if( y % 2 != 0 )
        System.out.print( y + ", " ); // 실행
      }
      y++;
    }
    System.out.println();
    System.out.println("=======================");
    // i  sum = 누적값  0 ~ 10 까지

    int i = 0;
    int sum = 0;
    while ( i <= 10 ) {
      sum += i ;
      i++;
    }
    System.out.println("0 ~10까지 합 :" + sum );
    System.out.println();
    System.out.println("=======================");

    int z = 0, max = 30, sum1 = 0;
    while ( z <= max ) {
      sum1 = sum1 + z ; // sum1 += z
      System.out.println("sum1"+sum1+"/z :"+ z);
      z++;
    }
    System.out.println("sum1"+sum1+"/z :"+ z);

  }//end main
}

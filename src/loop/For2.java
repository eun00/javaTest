package loop;

public class For2 {
  public static void main(String[] args) {
    // 0 ~ 20 까지 짝수만 출력 : for + if
    for( int i = 0 ; i <= 20 ; i++ ){
        if( i % 2 == 0 ){
          System.out.print(i + "\t");
        }
    }//end for
    System.out.println();
    System.out.println("===========================");
    for( int i = 0; i <= 20; i = i + 2 ) { // i += 2
      System.out.print(i + "\t");
    }
    System.out.println();
    System.out.println("===========================");

    // 0 ~ 20 홀수 출력
    for( int i = 0 ; i < 21 ; i++  ) {
      if( i % 2 != 0 ) { // if( i % 2 == 1 )
        System.out.print(i + "\t");
      }
    }
    System.out.println();
    System.out.println("===========================");

    for( char ch = 'a' ; ch <= 'z' ; ch++ ) {
      System.out.print(ch + "\t");
    }
    System.out.println();
    System.out.println("===========================");

    /*
    1 ~ 100 까지 아래 결과처럼  출력해보세요
     1 2 3 4 5 6 7 8 9 10
     11 12 13    ~     20
     21 22  ~          30
     ...
     91 92 93 ~ 100
     */

    for( int i = 1 ; i <= 100 ; i++ ) {
      System.out.print(i + "\t");
      //10의 나눈 나머지 0이면
      if( i % 10 == 0 ) {
        System.out.println();
      }
    }

  } //end main
} // end class

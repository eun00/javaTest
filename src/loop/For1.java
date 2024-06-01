package loop;

public class For1 {
  public static void main(String[] args) {
    // 동일코드(10줄) 연속(반복)으로 10번(50?) 실행할경우
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");

    System.out.println("=========================");
    for( int i = 1 ; i <= 3 ; i++ ) {

      System.out.println("지금은 1교시 입니다.");

    }
    System.out.println("=========================");

    int x = 0;
    System.out.println("현재 값 :" + x ); //0
    x++;
    System.out.println("현재 값 :" + x ); //1
    x++;
    System.out.println("현재 값 :" + x ); //2
    x++;
    System.out.println("현재 값 :" + x ); //3

    System.out.println("=========================");

    for( int i = 0 ; i<=3 ; i++ ) {
      System.out.println("현재값 : " + i);
    }
    System.out.println("=========================");
    // 1부터 10까지 i 출력
    for( int i = 1 ; i <= 10 ; i++ ) {
      System.out.println( i + ", ");
    }
    System.out.println("=========================");
    for( int i = 1 ; i <= 10 ; i = i+1) {
      System.out.println( i + ", ");
    }
  }//end main
}//end class

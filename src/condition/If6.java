package condition;

public class If6 {
  public static void main(String[] args) {
    int z = 10;
//    if( z > 0 ) {
//    if( z >= 0 ) {
    if( z == 0 || z > 0) {
      System.out.println("양수");
    }else {
      System.out.println("음수");
    }

    int c  = 200;
    //if( c < 0 || c > 100) {
    if( c <= -1 || c >= 99) {
      System.out.println("범위초과");
    }else {
      System.out.println("정상범위");
    }
    //
    if( c >= 0 && c <= 100) {
      System.out.println("정상범위");
    }else {
      System.out.println("범위초과");
    }
  }
}

/*
z  = 숫자
     0,10,-10
1. 단일if문
   양수 / 음수 / 0입니다
2. if ~ else
    0,10 : 양수
    -10 : 음수
* */

/*
 int z = 10;
    if( z > 0 ) {
      System.out.println("양수");
    }
    if( z < 0) {
      System.out.println("음수");
    }
    if( z == 0) {
      System.out.println("0이다");
    }
* */

/*
c  변수에 숫자
-1, 0보다작다,100넘으면
범위 초과
 0 ~ 100 : 정상범위
* */
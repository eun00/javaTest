package condition;

public class If5 {
  public static void main(String[] args) {
    //1. 두개의 정수값중이 큰값을 출력하시오 a , b => 결과 max : type int
    int a = 30;
    int b = 40 ;
    if( a > b ) {
      System.out.println("최대값:"+a);
    }else {
      System.out.println("최대값:"+b);
    }
   // 문제2
   //나이(age) 18이상이면 성인, 미성년
    int age = 15;
    if( age >= 18 ) {
      System.out.println("성인");
    }else {
      System.out.println("미성년");
    }
    
    //  정수(x) 2로 나눈나머지 0면 짝수, 홀수
    int x = 31;
    if( x % 2 == 0 ) {
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

    // 점수(score) 80이상이면 합격, 불합격
    int score = 85; 
    if( score >= 80 ) {
      System.out.println("합격");
    }else {
      System.out.println("불합격");
    }
  }
}

package loop;

public class For3 {
  public static void main(String[] args) {
    // 누적 합계 0 ~ 3의 합계
    int sum = 0; // 누적대상의 초기값 필수
    sum = sum + 1; // sum:0+1 => sum:1
    System.out.println("sum:" + sum);
    sum = sum + 1; // sum:1+1 => sum:2
    System.out.println("sum:" + sum);
    sum = sum + 1; // sum:2+1 => sum:3
    System.out.println("sum:" + sum);
    System.out.println("==========================");

    int hap = 0;
    for( int i = 0 ; i<=10 ; i++ ){
      hap += i;  // hap = hap + i ;
      //System.out.println("i = " + i + "hap =" + hap );
    }
    System.out.println("0 ~ 10 합 : " + hap );

   /*
   1부터 50
    3의 배수의 합
    3의 배수의합 : xxx
    */
    int sum1 = 0;
    for( int i = 0 ; i<=50 ; i++ ){
      if( i % 3 == 0 ) {
        sum1 += i;
      }
    }
    System.out.println("0 ~ 50 : 3의 배수의 합 : " + sum1 );


  } //end main
}

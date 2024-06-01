package loop;

public class If {
  public static void main(String[] args) {
  /*
    시나리오]
  숫자를 홀/짝수인지 먼저 판단한 후 100 이상인지를
  판단하는 프로그램을 if~else구문을 이용하여 작성하시오.
   */
    int num = 120;
    if( num % 2 == 0 ) { // 짝수일때
      if( num >= 100 ) {
        System.out.println("짝수이면서 100이상");
      }else{
        System.out.println("짝수이면서 100미만");
      }
    }else { // 홀수일때 
      if( num >= 100) {
        System.out.println("홀수이면서 100이상");
      }else {
        System.out.println("홀수이면서 100미만");
      }
    }
  }
}

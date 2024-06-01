package string1;

public class Str4 {
  public static void main(String[] args) {
      String str1 ="홍길동,김철수,강호동,김고은";

    System.out.println( str1.length() );
      //배열 선언
    String[] arr = str1.split(",");
    // arr[0] = "홍길동"
    // arr[1] = "김철수"
    // arr[2] = "강호동"
    // arr[3] = "김고은"
    System.out.println( arr.length );
    System.out.println( arr[0]);
    System.out.println( arr[1]);
    System.out.println( arr[2]);
    System.out.println( arr[3]);


    String ssn = "240511-41111111";
    //앞자리 Array, 뒷자 Array
    // ssnArr
    String[] ssnArr = ssn.split("-");
    System.out.println( ssnArr[0]);
    System.out.println( ssnArr[1]);

    String tel = "010-0000-1111";
    String[] telArr = tel.split("-");
    System.out.println( telArr[0]);
    System.out.println( telArr[1]);
    System.out.println( telArr[2]);

  }
}


//String 객체를 지정한 구분자를 이용하여 여러 개의 문자열로 나눕니다.  문자열을 담은 Array.
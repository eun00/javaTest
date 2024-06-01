package string1;

public class Str5 {
  public static void main(String[] args) {
      String str = "안녕하세요 저는 홍길동 입니다. 자바";
      String newStr = str.replace("자바","java");
    System.out.println( str );
    System.out.println( newStr );

    //indexOf : 인덱스값 반환 , 값을 찾지못하면 -1
    //searchValue의 첫 번째 등장 인덱스. 찾을 수 없으면 -1.

    int idx1 = str.indexOf("안");
    System.out.println( idx1 );

    idx1 = str.indexOf("홍길동");
    System.out.println( idx1 );

    idx1 = str.indexOf("김고은");
    System.out.println( idx1 );

    //true/ false
    boolean str1 = str.contains("녕");
    System.out.println( str1 );

    str1 = str.contains("홍길동");
    System.out.println( str1 );

    str1 = str.contains("김고은");
    System.out.println( str1 );

    //조건 : 자바가 존재여부 indexOf  => if : indexOf자바찾음/ indexOf자바못찾음
    int txt1 = str.indexOf("자바");
    if( txt1 != -1 ) {  //if( txt1 > -1 ) {
      System.out.println("indexOf 자바찾음");
    }else {
      System.out.println("indexOf 자바 못찾음");
    }

    //조건 : 자바가 존재여부 contains  => if : contains자바찾음/ contains자바못찾음

    boolean txt2 = str.contains("자바");
    if( txt2 ) {  //if( txt2  == true  ) {
      System.out.println("contains 자바찾음");
    }else {
      System.out.println("contains 자바 못찾음");
    }
    //영문은 대소문자 구별한다
    String text1  = "naver Dog Cat good daum eZen Nate Java";
    //1. 해당 문자열을 대문자 또는 소문자로 변환 ( 소문자로 )
    //2. 찾는 글자를 대문자 또는 소문자로 변환  ( 소문자로 )
    // 1에 2번 있는지 체크 : indexOf , contains )
    // if문
    int idx2 = text1.indexOf("cat");
    System.out.println( idx2 );

  }
}

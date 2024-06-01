package array;

public class Ex0 {
  public static void main(String[] args) {
    //영문은 대소문자 구별한다
    //1. 해당 문자열을 대문자 또는 소문자로 변환 ( 소문자로 )
    //2. 찾는 글자를 대문자 또는 소문자로 변환  ( 소문자로 )
    // 1에 2번 있는지 체크 : indexOf , contains )
    // if문

    String text1  = "naver Dog Cat good daum eZen Nate Java";
    String text2 = text1.toLowerCase();
//    String txt = "cAT".toLowerCase();
    String txt = "cAT";
    int idx = text2.indexOf( txt.toLowerCase() );
    if( idx != -1 ) {
      System.out.println("cat를(을) 검색했습니다.");
    }else {
      System.out.println("cat는(은)  존재하지 않습니다.");
    }

    //contains
    boolean ch = text2.contains( txt.toLowerCase() );
    if( ch ) {
      System.out.println("cat를(을) 검색했습니다.");
    }else {
      System.out.println("cat는(은)  존재하지 않습니다.");
    }

  } // end main
}

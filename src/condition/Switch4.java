package condition;

public class Switch4 {
  public static void main(String[] args) {
    int month = 3;
    String result = "";
    switch ( month) {
      case 3: case 4: case 5:
        result ="봄";
        break;
      case 6,7,8 : result ="여름";break;
      case 9,10,11 : result ="가을";break;
      case 12: case 1: case 2: result ="겨울"; break; 
      default : result="해당월 없음";
    }
    System.out.println( result );
  }
}

/*
월 : month , result : 결과
정수 month = 3
문자열 result : 봄
3,4,5 : 봄
6,7,8 : 여름
9,10,11 : 가을
12,1, 2 : 겨울
그외 : 해당계절 없음
* */
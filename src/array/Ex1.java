package array;
// 같은 타입의 데이터가 5개 있다
public class Ex1 {
  public static void main(String[] args) {

    // 데이터가 들어오는 개수만큼 방크기 설정
//    String[] names = new String[]{"김고은","김태리","유재석","강호동", "이도현"};
    String[] names = {"김고은","김태리","유재석","강호동", "이도현"};

   //for문 수정 ??  fori
    for (int i = 0; i < names.length ; i++) {
      System.out.println( names[i] +"님 안녕하세요");
    }

  }
}

// Array : 같은 형의 데이터 나열

// step1
/*
 String name1 = "김고은";
      String name2 = "김태리";
      String name3 = "유재석";
      String name4 = "강호동";
      String name5 = "이도현";

    System.out.println( name1 +"님 안녕하세요");
    System.out.println( name2 +"님 안녕하세요");
    System.out.println( name3 +"님 안녕하세요");
    System.out.println( name4 +"님 안녕하세요");
    System.out.println( name5 +"님 안녕하세요");
 */


// step2
/*
//    String[] names = new String[5]; // 배열 선언 ( 공간설정 )
//   배열명[인덱스] = "타입에 맞는 값";

    String names[] = new String[5];
//  타입 배열명[] = new 타입[개수];
      names[0] = "김고은";
      names[1] = "김태리";
      names[2] = "유재석";
      names[3] = "강호동";
      names[4] = "이도현";

    System.out.println( names[0] +"님 안녕하세요");
    System.out.println( names[1] +"님 안녕하세요");
    System.out.println( names[2] +"님 안녕하세요");
    System.out.println( names[3] +"님 안녕하세요");
    System.out.println( names[4] +"님 안녕하세요");
 */
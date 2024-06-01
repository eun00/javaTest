package array;

public class Ex2 {
  public static void main(String[] args) {

//    String[] menus = new String[]{"불고기","라면","우동","라멘","갈비"};
    String[] menus = {"불고기","라면","우동","라멘","갈비"};



//    int[] price =new int[]{3000,4000,5000,2500,4500};
    int[] price = {3000,4000,5000,2500,4500};

    //for문 fori
    for (int i = 0; i < 5; i++) {
      System.out.println(menus[i] + "주문");
      //System.out.println(price[i] + "원");
    }

    //for-each문 : 향상된 for문 => 값  출력
    for( String menu:menus ) {
      System.out.println(menu + "주문");
    }



    System.out.println("총 메뉴의 개수는 " + menus.length +"개 입니다.");
  }
}


/*
    // 문자열 데이터 5개 음식 메뉴 =? 각가의 변수는 줄이거나 ? 코드 활용성?
    String menu1 = "불고기";
    String menu2 = "라면";
    String menu3 = "우동";
    String menu4 = "라멘";
    String menu5 = "갈비";

    System.out.println(menu1 + "주문");
    System.out.println(menu2 + "주문");
    System.out.println(menu3 + "주문");
    System.out.println(menu4 + "주문");
    System.out.println(menu5 + "주문");

    System.out.println("총 메뉴의 개수는 " + 5 +"개 입니다.");
  }

 */

/*
  String[] menus = new String[5];
//  String menus[] = new String[5];

    menus[0] = "불고기";
    menus[1] = "라면";
    menus[2] = "우동";
    menus[3] = "라멘";
    menus[4] = "갈비";

    System.out.println(menus[0] + "주문");
    System.out.println(menus[1] + "주문");
    System.out.println(menus[2] + "주문");
    System.out.println(menus[3] + "주문");
    System.out.println(menus[4] + "주문");

    System.out.println("총 메뉴의 개수는 " + menus.length +"개 입니다.");
 */
package array;

public class Ex9 {
  //make( 매개변수 => 받는변수 (타입동일 ))
  public static void make(String x ) {
    System.out.println("안녕하세요 "+ x +"입니다.");
  }

  public static void make1(String name, int age, String addr ){
    //홍길동, 20, 인천
    System.out.println(name+"의 나이는"+age+"이고 "+addr+"에 삽니다");
  }

  public static void main(String[] args) {
    System.out.println("이름 메서드(매개변수 or 파라미터)");
    make1("김고은", 20, "인천");
    make1("김태리", 25, "서울");
    make1("이도현", 28, "제주");

    System.out.println();
    make("김고은");
    make("이도현");
    make("최민식");
    make("유해진");




  }
}

/*
System.out.println("안녕하세요 홍길동입니다.");
    System.out.println("나이는 20살 입니다");
    System.out.println("------------");
    System.out.println("안녕하세요 김태리입니다.");
    System.out.println("나이는 22살 입니다");
    System.out.println("------------");
    System.out.println("안녕하세요 김고은입니다.");
    System.out.println("나이는 26살 입니다");
    System.out.println("------------");
    System.out.println("안녕하세요 박연진입니다.");
    System.out.println("나이는 28살 입니다");
    System.out.println("------------");
 */
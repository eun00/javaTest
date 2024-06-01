package condition;

public class If10 {
  public static void main(String[] args) {
    double rating = 9.3;
    String result = ( rating >= 9 ) ? "파묘 추천":( rating >= 8 ) ? "아쿠아맨 추천" : ( rating >= 7 ) ? "범죄도시 추천" : "아무거나 추천";
    System.out.println( result );
  }
}


/*
double rating = 8.3;
    if( rating <= 9 ) {
      System.out.println("파묘 추천");
    }
    if( rating <= 8 ) {
      System.out.println("아쿠아맨 추천");
    }
    if( rating <= 7 ) {
      System.out.println("범죄도시 추천");
    }
    if( rating < 7 ) {
      System.out.println("아무거나 추천");
    }


    if( rating >= 9 ) {
      System.out.println("파묘 추천");
    }else if( rating >= 8 ) {
      System.out.println("아쿠아맨 추천");
    }else if( rating >= 7 ) {
      System.out.println("범죄도시 추천");
    }else {
      System.out.println("아무거나 추천");
    }

* */
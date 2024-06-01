package loop;

public class Break02 {
  public static void main(String[] args) {
    int x = 0 ;

    while ( true ) {
        x = (int) (Math.random() * 50) +1 ;
      System.out.print(x + ", ");
      if( x == 30 ) {
        break;
      }
    }
  }// end main
}

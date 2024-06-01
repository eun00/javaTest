package array;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    //점수를 4개 입력받기 배열 arr
    Scanner scanner = new Scanner(System.in);
    //배열 선언

    System.out.println("점수를 몇개 입력하시겠습니까? >> ");
    int cnt = scanner.nextInt();

    int[] arr = new int[cnt];
    int sum = 0;
    double avg = 0.0;

    System.out.println(cnt + "개의 점수를 입력하세요 >> ");
    for (int i = 0; i < cnt ; i++) {
        arr[i] = scanner.nextInt();
    }
    //출력 for
    for (int i = 0; i < arr.length ; i++) {
      sum += arr[i];
      System.out.print(arr[i] );
      if( i < arr.length - 1) {
        System.out.print(" , ");
      }
    }
    System.out.println();
    avg  = (double) sum/arr.length;
    System.out.println("총점 : " + sum );
    System.out.println("평균 : " + avg );
  }
}


/*
package array;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    //점수를 4개 입력받기 배열 arr
    Scanner scanner = new Scanner(System.in);
    //배열 선언
    int[] arr = new int[4];
    int sum = 0;
    double avg = 0.0;

    System.out.println(" 점수 4개를 입력하세요 >> ");
    for (int i = 0; i < arr.length ; i++) {
        arr[i] = scanner.nextInt();
    }
    //출력 for
    for (int i = 0; i < arr.length ; i++) {
      sum += arr[i];
      System.out.print(arr[i] );
      if( i < arr.length - 1) {
        System.out.print(" , ");
      }
    }
    System.out.println();
    avg  = (double) sum/arr.length;
    System.out.println("총점 : " + sum );
    System.out.println("평균 : " + avg );
  }
}

 */
package operator;

public class Operator08 {
  public static void main(String[] args) {
//name:문자열, kor:정수, eng:정수, mat:정수, sum:정수, avg:실수
    String name ="홍길동";
    int kor = 80, eng =80, mat =80, sum = 0;
    double avg = 0.0;

    sum = kor + eng+ mat; //총점
    avg = (double) sum / 3;  // 평균

    System.out.println("이름 :" + name );
    System.out.println("국어 :" + kor );
    System.out.println("영어 :" + eng );
    System.out.println("수학 :" + mat );
    System.out.println("평균 :" + avg );
  }
}

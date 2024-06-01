package array;

public class Ex4 {
  public static void main(String[] args) {
      int[] scores = {80,60,90,100,70};
      int sum = 0;
      double avg = 0.0;

    for (int i = 0; i < scores.length ; i++) {
//          sum = sum + scores[i];
          sum += scores[i];
    }//end for

//    avg = sum / 5.0;
    avg = (double) sum / scores.length;

    System.out.println("총점은 " + sum +"입니다.");
    System.out.println("평균은 " + avg +"입니다.");
  }
}

/*
정수형
scores 배열
값 5개의 점수

총점과 평균구하기
sum, avg
 */

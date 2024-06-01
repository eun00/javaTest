package condition;

public class If1 {
  public static void main(String[] args) {
    // 1. 점수가 80이상이면 합격 
    //    점수가 80미만 불합격
    // 단일 if문 
    int score = 75; 
    if( score >= 80 ) {
      System.out.println("합격");
    }
    if( score < 80 ) {
      System.out.println("불합격");
    }
  }
}

/*
* 만약에 ~ 이면 if문
* 1. 단일 if문
* if(조건식) {
*    참결과
*    참결과
* }
* if( 조건식 ) {
*   참결과가 1줄일때
* }
* if( 조건식 ) 참결과가 1줄일때
*
* 
* 2. if ~ else 
*  if( 조건식 ) {
*     참 결과
*  }else {
*     거짓 결과
*  }
* (조건식) ? 참 : 거짓
*
* 3. 다중 if문
*    비슷한 , 연관된 내용을 조건판단
*  if( 조건식1 ) {
*    참1결과
*  }else if( 조건식2 ) {
*    참2결과
*  }else if( 조건식3 ){
*    참3결과
*  }else {
*    그외 나머지결과
*  }
*
* ( 조건식1 ) ? 참1:(조건식2) ? 참2 : (조건식3)? 참:거짓
* */

/*
*  수업이 끝나고 (사실)
*  친구를 만나면 ( 선택 : 조건 )
*  저녁을 먹는다 ( 참결과 )
* 1. 단일 if문
*    if( 친구를 만나면 ) {
*     저녁을 먹는다
*    }

 *  수업이 끝나고 (사실)
 *  친구를 만나면 ( 선택 : 조건 )
 *  저녁을 먹는다 ( 참결과 )
 *  그렇지 않으면
 *  집에간다 ( 거짓 결과 )
    if( 친구를 만나면 ) {
        저녁을 먹는다
     }else {
        집에간다
     }

* 다중 if문 : 결과 여러개 주제: 친구를 만난다
* 결과 ? 5 -1 : if문 개수 (  반드시는 아니다 )
* 재석이를 만나면 커피를 마신다
* 호동이를 만나면 술를 마신다
* 고은를 만나면 저녁를 먹는다
* 혜교를 만나면 클럽에 간다
* 그렇지 않고 아무도 만나지 않으면
* 집에간다
*
* if( 재석이를 만나면 ) {
*   커피를 마신다
* }else if( 호동이를 만나면 ) {
*   저녁를 먹는다
* }else if( 혜교를 만나면 ) {
*   클럽에 간다
* }else {
*   집에간다
* }
* */
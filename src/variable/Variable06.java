package variable;

public class Variable06 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp ;
    System.out.println("교환 전 : a :" + a + "/ b:" + b );
    //값을 교환 원리
    temp  = a ;
    a = b ;
    b = temp ;
    System.out.println("교환 후 : a :" + a + "/ b:" + b );
  }
}

/*
* 나중에 알고리즘( 사고력 ) 공부해보세요
지금은 문법 연습정도라고 생각하시면 됩니다.

예 ) 사고력 연습

a = 10
b = 20
두개의 값을 교환하시오
temp 변수 만들기
1. a 의 값을 temp 넣고
2. b 값을 a에 넣어주고
3. temp값을 b에 넣어주세요

* */
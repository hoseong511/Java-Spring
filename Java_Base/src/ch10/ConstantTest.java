package ch10;
/*
상수(constant) 선언하기
- 상수는 변하지 않는 수
- final 예약어를 사용하여 선언
- 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
  혹은 변하더라도 선언한 부분만 변경하면 되므로 여러 부분을 수정할 필요가 없음.
 */
public class ConstantTest {
    public static void main(String[] args) {
        final int MAX_NUM = 100; // 선언을 해준 부분만 수정을 하면 되므로 상수를 사용한다.
        final int MIN_NUM;
        // MAX_NUM = 20; -> 상수 처리가 되어서 바뀔 수 없다.

        MIN_NUM = 20;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);




    }
}

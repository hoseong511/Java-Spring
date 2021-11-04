package ch10;
/*
리터럴(literal)
- 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
- 리터럴은 상수 풀(constant pool)에 있음
- long 형 이면 L,l.  float 형 이면 F,f을 뒤에 붙임. (ex
형 변환(type conversion)
- 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
- 묵시적 형 변환(explicit type conversion, 자동 형 변환)과 명시적 형 변환(implicit type conversion, 강제 형 변환)이 있음
- 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
- 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어 짐
 */
public class Literal {
    public static void main(String[] args) {
        long lNum = 10L;
        double dNum = 10.3D;

        byte bNum = 10;
        int iNum = bNum;

        int iNum1 = 20;
        float fNum = iNum1;

        int iNum2 = 127;
        byte bNum2 = (byte)iNum2; // iNum2를 byte형에 넣을려면 형변

        System.out.println(bNum2);
    }
}

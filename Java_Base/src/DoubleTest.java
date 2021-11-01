public class DoubleTest {
    public static void main(String[] args) {
        double dnum = 3.14; // 숫자는 메모리 공간에 자리를 잡는데
        float fnum = 3.14f; // 그것을 fnum이 참조를 하게되어 오류가 발생
        long lnum = 8;
        byte bnum = 8;
        int iNum = 8;
        System.out.println(fnum);
        System.out.println(dnum);
        float ff = 3.0f; // 식별자 사용; 실수는 기본적으로 double(8byte)에 저장되고
                            // 8byte에 저장되어있는 수를 복사해오는 방식으로 float을 지정하기 위해
    }                       // 식별자를 붙여준다.


}

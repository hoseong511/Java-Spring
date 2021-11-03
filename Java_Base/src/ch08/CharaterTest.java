package ch08;

public class CharaterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        char han = '한';
        char ch = '\uD55C'; // unicode로 표현할때, unicode는 16진수(4bit)가 4개, 그 결과 4bit*4=16bit=2byte
        System.out.println(han);
        System.out.println(ch);
/*      지역 변수 자료형 없이 사용하는 방법이다. 해당 기능은 자바 10 이후 부터 지원된다.*/
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);
        str = "ho";
        System.out.println(str);
//        str = 3; // 컴파일 시 자료형이 문자배열로 정해져있어서 다른 자료형 값을 넣을 수 없다.

    }
}

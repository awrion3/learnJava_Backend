package basic;

public class Operator {
    public static void main(String[] args) {
        //arithmetic operator
        int a = 5, b = 2;
        int sum = a + b;
        //덧셈
        System.out.println("a + b = " + sum);
        //주의: 문자열과 숫자 더하기 (이 경우 숫자가 문자열로 변환됨: String + => always String)
        System.out.println("a + b = " + a + b);
        //나눗셈
        int div = a / b;    //int 몫 값 출력 (형 변환 자동 버림)
        System.out.println("a / b = " + div);
        //나머지
        int mod = a % b;    //나머지 값
        System.out.println("a % b = " + mod);
        //0으로 나누기는 예외 발생시킴
        //arithmetic order of operation: PEMDAS (우선순위가 명확해도, 되도록 괄호를 넣는 것 권장)

        //괄호 > 단항 > 산술 >
        //시프트 >
        //비교 > 등식(== !=)    //instance of
        //비트 >                //& | ^ ~ << >>(음수는 빈공간 1) >>>(빈공간 0)
        //논리 > 삼항 > 대입

        //단항: 증감 연산
        int A = 10;
        System.out.println(A++);    //print first, then ++
        System.out.println(A);

        //등식 (숫자) Comp
        int B = 3, C = 3;
        System.out.println(A == B);
        System.out.println(B == C); //비교 결과는 boolean에 담을 수 있다
        //등식 (문자열) .equals 사용
        String str1 = "AB";
        String str2 = "AB";

        System.out.println(str1 == str2); //객체 참조값 즉 주소 비교
        System.out.println("AB".equals(str1));  //리터럴과 문자열 비교
        System.out.println(str1.equals(str2));  //문자열 비교
        //ctrl + shft + enter 세미콜론 문장 자동 완성

        //논리 Logical
        System.out.println(true && false); //AND
        System.out.println(true || false); //OR

        //자주 사용하는 연산자
        //산술 (+ - * / %)
        //증감 (++ --)
        //비교 (> < >= <= == !=)
        //논리 (&& || !)
        //대입 (= += -= *= /= %=)

        //삼항 ( ? : )
        //객체 타입 확인 (instance of)
        //그외 new, [ ], .(객체 맴버 접근), () 메소드 호출
    }
}

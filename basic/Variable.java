package basic;

public class Variable {
    public static void main(String[] args) {    //psvm
        System.out.println(10);   //sout
        //변수 타입(형식) 변수 이름 = 직접 넣은 고정값 (literal == 불변 <> 변수값)
        int a = 10;
        double b = 10.5;
        boolean c = true;
        char d = 'a';   //작은따옴표
        String e = "abc";   //큰따옴표로 변수 초기화 //대문자로 변수 선언 (클래스)

        //정수 - int 기본, 길면 long, 파일이면 byte
        byte A; //1byte = 2^8   //파일 다룰 때 사용
        short B; //2byte
        int C; //4byte* //basic //java default 4byte
        long D = 10L; //8byte //20억 넘을 것 같을 때

        //실수 - double 사용 권장
        float E = 10.1f; //4byte
        double F; //8byte*  //basic

        //기타 - 참거짓 boolean, String 문자열과 문자 모두에 사용
        boolean G; //1byte
        char H;     //1byte*
        String I;   //...byte   //문자 하나도 문자열 "A"로 쓰는 것 권장

        //규칙, 관례
        int varName = 10; //변수 이름(숫자 시작 불가) 낙타표기법
        //클래스만 첫문자부터 대문자 ClassName
        //상수는 모두 대문자 사용 및 언더바! USER_LIMIT
        //패키지는 모든 소문자 org.spring.boot
        System.out.println("varName = " + varName);
        //soutv 가까운 변수 or 커서를 높은 값 출력 양식을 자동으로 생성
        //soutm 커서 높은 메서드 이름 출력

        int var$;   //$는 사용 가능 (영문자, 숫자, 언더바 외에)
    }
}
//java to class (compiler, turn to bytecode, comment erase, variable not used will be deleted)
//shift + f10 실행
//local variable (declared inside method) must be initialized
//error line, letter
//ctrl + d 복사 //shift 드래그로 범위 설정


package basic;

public class Method {   //function
    public static void main(String[] args) {
        //메서드 호출 시, 넘기는 값(인자) == 파라미터(매개변수) 타입 일치해야 한다
        //printNumber((int) number);처럼 인자 넘길 때 명시적 형변환 가능
        //인자보다 매개변수 타입의 범위가 더 큰 경우, 자동적 형변환 발생
        //int가 인자일 때, 매개변수가 int / double인 두 메서드 모두 존재시, 인자 타입에 최대한 맞는 메서드를 찾아서 자동 실행
        int sum = add(5, 10);
        System.out.println(sum);
    }
    //add method
    //제어자modifier public: 다른 클래스에서 호출 가능한 메서드 /static: 객체 생성하지 않고 호출 가능한 정적 메서드
    public static int add(int a, int b) { //메서드 선언(이름 add, 반환 타입 int 없을시 void, 파라미터 목록 int int 없을시 ())
        return a + b;   //메서드 본문 (블랙박스) //return에서 해당 메서드 즉시 종료 (void의 경우 예외로 return 생략 가능)
    } //조건에 따른 return인 경우, 반환 안될 가능성이 존재하면 컴파일 오류 //void 반환 타입인 경우, 호출 후 반환값 받으려 하면 오류 발생

    //자바에서는 항상 변수 값을 복사해서 대입한다 //변수의 값을 별개로 복사해서 대입하는 것이다
    //즉 기본형 타입의 변수 값을 단순히 메서드 내에서 변경시, 이는 메서드 내에서만 변경됨에 유의
    //참조형 타입의 변수 값도 단순히 복사해서 사용하는 것인데, 이 경우 주소값을 복사해서 사용하므로 변경된다.

    //메서드 오버로딩: 같은 이름, 다른 파라미터 - 메서드 여러 개 정의 (과적)
    public static double add(double a, double b){
        return a + b;   //매개변수 타입이 다르게
    }
    public static int add(int a, int b, int c) {
        return a + b + c;   //매개변수 수가 다르게
    } //매개변수 타입 같고 반환 타입만 다르게 한 경우는, 오버로딩에 해당되지 않는다
    //method signature (메서드 고유 식별자) = 메서드 이름 + 매개변수의 타입 (아래처럼 순서포함)
    public void minus(int a, double b) {
        System.out.println(a - b);
    }
    public void minus(double a, int b){
        System.out.println(a - b);  //매개변수 순서를 다르게 해도 가능하다
    }
    //메서드를 사용해 main에서는 세세한 코드가 아닌 전체 구조를 한눈에 볼수 있게 한다
    //메서드로 분리시 특정 메서드로 수정 범위가 한정되어 유지보수가 좋게 리팩토링하는 것을 메서드 추출(extract method)이라 한다
    //코드 재사용, 가독성, 모듈성, 유지보수성, 재사용성, 확장성, 추상화(내부 작업 알 필요 없이 사용 가능), 테스트와 디버깅 용이성의 장점 존재
}

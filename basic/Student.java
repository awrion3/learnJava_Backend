package basic2;
//클래스는 객체를 생성하기 위한 설계도
public class Student {  //(== structure 구조체) 대문자로 시작
    ////클래스는 객체를 설계함에 있어 필요한 속성(변수)을 정의
    //field (== member variable 멤버 변수) 클래스에 소속된 변수들
    String name;
    int age;
    int grade;
    //참고로 맴버 변수(필드)는 클래스에 선언
    //(클래스를 통해 new로 생성한 인스턴스에서 멤버 변수는 자동 초기화된다
    //클래스를 설계함에 있어서 자동 초기화되는 값을 0이 아니게 직접 설정할 수 있다)

    //지역 변수는 메서드에 선언(메서드의 파라미터도 지역 변수의 일종)(main도 메서드)
    //지역 변수는 메서드가 끝나면 제거된다 (항상 직접 수동 초기화해야 한다)
    ////클래스는 객체를 설계함에 있어 필요한 기능(메서드)를 정의 ex) Object Class
    //get-set methods shortcut alt+insert
}

package basic2;
//import 패키지명.클래스명을 통해 다른 패키자의 클래스 사용 가능 (접근제어자에 따라)

public class Classes {  //structure (사용자 정의 변수 타입, 설계도)
    public static void main(String[] args) {
        //create instance(객체가 어떤 클래스에 속해있는지 강조할 때 사용, 관계에 초점) from student class
        Student std = new Student(); //클래스 설계도를 사용해 실제 메모리에 만든 실체 객체 (인스턴스)
        //Student std; 구조체 변수 선언
        //new Student(); 메모리에 실제 객체 생성 및 참조값 반환
        //(new ~자체에는 배열에서도 그랬듯 이름 X. 실제 메모리 공간 확보만. 즉 접근하기 위해 반환되는 참조값 보관 필요
        //=을 통해 생성된 해당 객체(인스턴스) 참조값 저장, 이를 사용해 해당 객체 접근해 사용 가능
        std.name = "John"; //해당 객체의 멤버 변수에 접근
        std.age = 18;
        std.grade = 90;

        System.out.println(std);    //객체 생성에 사용된 패키지명.클래스명@객체 자체의 정보 출력(객체의 참조값)
        System.out.println(std.grade);
        //객체는 클래스에서 정의한 속성과 기능을 가진 실체, 즉 생성된 Object끼리는 서로 독립적 상태를 가진다.
        Student std2 = new Student();
        std2.name = "Paul";
        //Student std3 = std2;    //인스턴스 복사가 아닌, 참조값을 복사하는 것임에 유의. 같은 객체를 가리키게 된다

        //참조값을 저장하는 배열 생성
        Student[] room = new Student[2];    //인스턴스를 보관하는 배열(각 원소 Null 값으로 초기화)
        room[0] = std;
        room[1] = std2;
        System.out.println(room[0]);      //해당 원소에 저장된 주소값인 인스턴스 std 참조값을 마찬가지로 출력
        System.out.println(room[0].name + "!"); //포인터 배열의 첫 원소인 인스턴스 std의 멤버 name에 접근해 값을 출력

        for (int i = 0; i < room.length; i++) {
            Student s = room[i];    //room[i]의 사용을 간략화할 수 있음 (참조값 복사해 저장하는 것)
            System.out.println(s.name); //건물 위치인 주소만 복사하는 것으로, 해당 건물을 찾아갈 방법이 하나 늘어난 셈.
        } //이를 향상된 for문으로 아래처럼 최적화
        for (Student s : room) {
            System.out.println(s.name);
        }

        //기본형은 소문자로 시작이 정해져 있다. int, boolean 등 사용자가 해당 데이터 타입을 직접 정의할 수 없다.
        //기본형을 제외한 나머지는 모두 참조형. 클래스의 경우 대문자로 시작. String은 클래스로 참조형이나, 기본형으로 취급.
        //기본형과 달리 참조형 타입은 들어있는 참조값을 대상으로 연산을 그대로 수행 X. 주소지에 일단 가서 실체 값을 가져와 수행한다.
        //따라서 참조형 타입의 경우, 객체와 배열 각각 실제 데이터 접근에 있어서 .과 []을 사용

        //메서드 호출에 있어서도 기본형과 참조형은 차이가 나게 된다
        //기본형의 경우, 메서드 안에서 값 변경시, 반환 값으로 갱신하지 않는 한 영향이 없다
        //참고로 메서드가 종료되면 파라미터에서 선언된 지역변수도 삭제되게 된다
        //참조형의 경우, 이를 인자로 넘겨 메서드 안에서 값 변경하면 가리키는 데이터 값에 영향을 주게 된다

        Student std3 = new Student();
        //초기화를 메서드를 사용해 간략화할 수 있다
        initStudent(std3, "Mary", 25, 95);

        //생성부터 메서드를 사용해 간략화할 수 있다 (반환된 참조값 저장 필요)
        Student std4 = createStudent("Jenkins", 35, 100);
        System.out.println(std4.name); //반환된 참조값 사용해 멤버 변수 접근 가능
    }
    //정적 메서드로 객체 생성 후의 초기화에 있어 단축시킬 수 있다
    static void initStudent(Student std, String name, int age, int grade) {
        std.name = name;
        std.age = age;
        std.grade = grade;
    }
    //정적 메서드로 초기화와 더불어 객체 생성도 단축시킬도 있다
    static Student createStudent(String name, int age, int grade) {
        Student std = new Student();  //생성 (메모리 할당)
        std.name = name;  //초기화
        std.age = age;
        std.grade = grade;
        return std;       //생성 및 초기화된 객체의 참조값 반환
    }
}
package basic2;

public class Null {
    public static void main(String[] args) {
        Study studyN = new Study();  //ctrl + A + V 변수명 생성
        //인스턴스 생성 후 참조값을 null로 대입한 경우, 아무도 참조하지 않는 인스턴스는 할당된 메모리 공간을 낭비한다
        studyN = null;
        //다만 자바의 경우 JVM의 GC 가비지 컬렉션이 객체가 더 참조되는 곳이 없음을 파악해 메모리에서 알아서 제거해준다
        //studyN.studentID = 2001;
        //인스턴스에 저장된 null이 된 참조값을 사용해 멤버 변수에 접근해 값을 저장하려 하면, NullPointerException이 발생하게 된다

        //참고로 메서드 내 지역변수는 비교적 직관적으로 이러한 오류 파악 가능
        //클래스 내 멤버변수가 다시 참조형인 경우 (자동 초기화에 따라 아직) null인 경우, 이를 해결하고 사용해야 한다
        studyN = new Study(); //다시 새로운 메모리 할당
        System.out.println(studyN.studentID);  //멤버변수의 기본형 (취급), 참조형 변수들 0/null로 초기화되었기에 해당 값 출력
        System.out.println(studyN.studentScore);
        //studyN.studentScore.value = 100; //참조형인 위의 멤버 면수가 null 값인데 해당 멤버 변수의 멤버 변수를 접근하려 할 시 오류 발생
        studyN.studentScore = new Score();  //위를 해결하기 위해 일단 멤버 변수에 메모리 할당을 통해 새 참조값을 저장한다
        System.out.println(studyN.studentScore.value);  //이후 해당 멤버 변수의 멤버 변수에 정상적으로 접근 가능
        //Score도 마찬가지로 멤버 변수 value를 가지며, 이도 멤버 변수기에 자동 0 초기화된 값이 출력됨을 알 수 있다
    } //NullPointerException은 null값에 .을 찍어 접근하여 함으로써 발생한 문제라 볼 수 있다
}

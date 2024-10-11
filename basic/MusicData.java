package basic2;

public class MusicData { //PP step1:데이터 묶음
    //OOP 속성
    int vol = 0;
    boolean on = false;
    //OOP 기능
    void addOOP(){ //객체는 메서드addOOP()를 통해 자신의 멤버 변수vol에 접근 가능하게 된다
        vol++;     //OOP는 한 클래스 내에서 데이터와 메서드 모두 관리 가능: 캡슐화 (속성+기능 묶어 필요한 기능 메서드를 통해 외부에 제공, 내부 구조 몰라도 됨)
        System.out.println("volume up: " + vol);
    }
    void removeOOP(){ //여기선 PP>OOP 메서드로 바꾸며 매개변수가 필요 없어짐 (현 클래스 내 멤버 변수 그대로 사용하게 됨)
        vol--;
        System.out.println("volume down: " + vol);
    }
    void onOOP(){
        on = true;
        System.out.println("music on");
    }
    void offOOP(){
        on = false;
        System.out.println("music off");
    }
}

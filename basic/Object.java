package basic2;

public class Object {
    //변수 변경 등 오류 이동 다음보기 f2
    public static void main(String[] args) {
        MusicData muse = new MusicData(); //인스턴스 생성

        //음악 플레이어 켜기
        muse.on = true; //*데이터 필드 사용
        //볼륨 증가
        muse.addOOP(); //*메서드 사용: 인스턴스의 메서드 호출도 멤버 변수 사용과 동일
        muse.addOOP(); //.을 찍어 해당 객체의 메서드 접근해 호출 //OOP 메서드를 통해 사용자는
        //음악 플레이어 끄기
        muse.on = false;
        System.out.println("Final Volume: " + muse.vol);  //*데이터(필드) 사용
    }
    //절차 지향 프로그래밍에서 PP step2:메서드 추출 예시 -> 모듈화의 장점
    public int addPP(int vol){
        vol++;
        return vol;
    }
    //중복 제거, 변경시 영향 범위 메서드 내로 제한, 메서드 이름 추가를 통한 가독성 향상
    //절차 지향 프로그래밍 한계: 데이터(MusicData Class에)와 메서드(Object Class에)가 여전히 분리
    //*OOP의 경우, 데이터와 기능을 하나로 묶기 가능
}

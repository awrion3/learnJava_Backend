package basic;

public class Loop {
    //class명 변경 시, 컨텍스트 창 alt+enter후 rename 파일하여 전부 반영되게 해야
    public static void main(String[] args) {
        int count = 0;

        //while
        while (count < 3) {
            count++;    //0, 1, 2 -> 총 3회 실행
            System.out.println(count); //1 2 3
        }
        //count = 3;
        do {
            count++;
            System.out.println(count);  //4 한번은 실행한다
        } while (count < 3);

        //break 즉시 loop 탈출
        //continue 즉시 loop의 조건식으로 이동
        //보통 if 조건식과 조합하여 loop 내 흐름 제어에 사용

        //for (1초기식; 2조건식5; 4증감식) { 3코드블록 실행6 } //1-> 2.3.4반복
        for (int i = 0; i < 3; i++) {   //for (;;) {} 무한반복
            System.out.println(i);
        } //i 변수의 경우 loop 안에서 선언시, loop 내에서만 사용 가능
        //for문 반복 횟수 명확- 카운트 변수 한눈에 확인 <> 코드 블록과 구분
        //while문은 명확한 반복 횟수(종료 시점)가 정해지지 않은 경우 사용하게 되는 셈
        //즉 loop 내에서 loop 조건이 변경되는 복잡한 경우에는 while문이 유리 혹은 사용자 값 입력받는 경우
        //다만 구조상 카운터 변수를 loop 밖에서 int i = 0; 선언하게 되므로, 이를 실수로 변경할 위험도 있음

        for (int i = 0, sum = 0; i < 3; i++, sum++) {   //조건식만큼은 , 사용 불가
            System.out.println("sum: " + sum);
        } //다만 증감식 및 카운터 변수(i)를 코드 블록(sum)과 따로 구분하는 것이 바람직

        //중첩 nested loop //3중 중첩부터는 다른 방식 고려
        for (int i = 0; i < 3; i++) {
            System.out.println("외부 i= "+i); //3번
            for (int j = 0; j < 3; j++) {
                System.out.println("내부 j= "+j); //1번당 * 3 => 총 9번
            }
        }

        //별찍기
        //*
        //**
        //***
        for (int i = 0; i < 3; i++) { //행 row 0 / 1 / 2
            for (int j = 0; j <= i; j++) { //열 column 0 / 0 1 / 0 1 2
                System.out.print("*");  //줄바꿈 없이
            }
            System.out.println(); //줄바꿈
        }
        //트리찍기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

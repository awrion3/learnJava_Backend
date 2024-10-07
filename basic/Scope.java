package basic;
//class 네비게이션 ctrl + n //최근 파일 ctrl + e
public class Scope {
    //local variable only exits within scope (code block)
    public static void main(String[] args) {
        int m = 10;  //scope: main method
        if (true){
            int x = 20;  //scope: if block
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        }//System.out.println("x = " + x);  //dead: cannot find symbol
        for (int i = 0; i < 2; i++){
            System.out.println("i = " + i);
        }//System.out.println("i = " + i) for문 밖에서는 i dead
    } //scope 범위 제한 관점에서 카운터 변수 i: while문에 비해 for문은 loop 범위로 한정
    //변수 선언에 있어 scope를 효율적으로 정해야 한다
    //if not: 비효율적 메모리 사용, 코드 복잡성 증가 문제
}

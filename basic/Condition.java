package basic;

public class Condition {
    public static void main(String[] args) {
        //if else if 배제
        //if if 독립조건 검사 시 사용 //일치하는 것마다 다 걸리게 하고 싶은 경우
        //되도록 {} 코드블럭 사용하기 생략할 수 있어도
        //가독성과 유지보수성 향상을 위해 (변경 사항이 적을 수록 좋은 코드)

        //switch
        int value = 1;
        switch(value){  //조건식 X 숫자 또는 문자, 값이 같은지만 확인 (최근은 문자열도 동등 비교 가능)
            case 1:
                System.out.println("1");
                break;  //아래 케이스에 다시 진입하지 않도록
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }

        //자바 14이상부터 새로운 switch문 등장
        int cost = switch (value){  //바로 대입 가능
            case 1 -> 1000; //break문 생략
            case 2 -> 2000;
            default -> 0;
        };
        System.out.println(cost);
        //-> 사용 (break문 불필요)
        //선택된 데이터를 바로 반환 가능 (대입 문장 반복 작성 불필요)

        //삼항(조건) 연산자 Ternary operator (참 거짓) //기왕이면 조건에 () 넣기
        boolean result = (10 > 1) ? true : false;
        System.out.println(result);

        int number = 10;
        String test = (number % 2 == 0) ? "even" : "odd";
        //java에서는 number % 2라고만 할 수 없다. 비교 결과가 boolean이어야 하는데
        //number % 2면 int 값이 반환될 뿐이므로 오류 발생
        System.out.println(test);
    }
}

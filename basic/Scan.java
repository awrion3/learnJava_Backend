package basic;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        String input; //변수 이름 한꺼번에 바꾸기 shift + f6
        Scanner scan = new Scanner(System.in); //코드 완성 ctrl + space

        System.out.print("Enter a string: ");   //개행 문자 포함 X
        input = scan.nextLine();
        System.out.println(input);  //개행 문자 자동 포함 (new line character)

        int input2;
        System.out.print("Enter an integer: ");
        input2 = scan.nextInt();
        System.out.println(input2);

        double input3;
        System.out.print("Enter an double: ");
        input3 = scan.nextDouble();
        System.out.println(input3);
        //입력 타입 맞아야 input type mismatch

        scan.nextLine();    //위에서 남은 개행 문자 제거 (위에서는 숫자만 가져가므로)
        while (true){
            System.out.print("Enter 'exit' to Finish Loop: ");
            String str = scan.nextLine();
            if (str.equals("exit")){    //문자열 비교이므로 == 사용 안함
                System.out.println("Program Terminated");
                break;
            } //sum 등의 계산에 있어 보통 break 다음에 위치시켜 조건을 벗어나는 입력은 sum에 포함되지 않도록 한다
        }
        //while문 조건 자체에 break문 조건 넣기
        int value;
        while ((value = scan.nextInt()) != -1){
            //(value = scan.nextInt()) 괄호 안칠 시 boolean 필요하다고 뜬다 
            //(대입보다 비교가 먼저기 때문) 즉 입력된 값과 != 비교 먼저 수행 -> boolean 값 생성
            //근데 이를 int형 value에 뒤늦게 대입 - 형 불일치 에러 발생
            System.out.print("Value: "+ value +"\n");
        }

        for (int i = 1; i <= input2; i++){
            System.out.print(i);
            if (i != input2){ //, 출력 조정
                System.out.print(", ");
            }
        }
    }
}

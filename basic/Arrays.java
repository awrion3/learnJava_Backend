package basic;

public class Arrays {
    public static void main(String[] args) {
        //배열 타입 변수 선언: 선언된 배열 변수에는 원소값이 아닌 '배열(의 시작주소)'을 담을 수 있게 된다
        int[] students; //int arr까지, 아직 배열 제대로 생성된 것 아님; 주소값을 저장할 공간 생성된 것.

        //new로 길이 5인 int형 배열 공간 확보 (이때 각 원소 자동 0/false/null 초기화)
        //new로 해당 배열 생성한 결과 주소값을 반환한다.
        //이를 기반으로 배열에 접근하기 위해 해당 참조값을 이전에 선언했던 students 배열 변수에 담아둔다.
        students = new int[5]; //배열 변수 (이름) <- 배열의 시작 주소 참조값 저장
        //int[] students 선언된 변수에는 new int[5]로 생성된 길이 5의 배열의 시작 주소값이 저장된다

        //students를 사용해 참조값을 바탕으로 배열을 찾아가 사용할 수 있게 된다
        System.out.println(students[0]); //index starts from 0 (시작주소) to n - 1, index 값이 length 크기면 out of bounds
        System.out.println(students); //배열 자체 정보 출력: [I int형 배열, @메모리 참조값 (배열 시작 주소) 16진수

        //{1, 2, 3}을 통해 배열 생성 과정에서 미리 정한 값으로 초기화 (크기는 3으로 자동 결정)
        int[] teachers = new int[]{1, 2, 3}; //해당 생성된 배열의 시작 주소값을 int[] teachers 배열 변수에 저장한다
        //위처럼 변수 선언과, 배열 생성 및 초기화를 한 라인으로 동시에 하는 경우, int[] 추론이 가능하므로 new int[] 부분 생략하고 {1, 2, 3};만 해도 된다
        System.out.println(teachers);

        //자바의 데이터 타입 분리
        int storage;
        //기본형: int long double boolean 같이 선언한 공간에 데이터 값 직접 저장 primitive type
        //선언과 동시에 사이즈가 정적으로 정해진다
        int[] arrStorage;
        //참조형: 배열 외에도 객체, 클래스를 생성하고, int[] arrName 같이 선언한 공간에 해당 주소값 저장 > reference type
        //배열의 동적 메모리 할당 방식; new int[size] 코드 실행 시점에 배열의 크기가 정해지게 된다
        //참조형의 경우, 저장된 주소값을 찾아가서 데이터 값을 가져와야 하므로 기본형에 비해선 약간 느리다

        //기능 동일 코드 개선: 리팩토링 (가독성 및 유지보수성 향상 목표)
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수: "+students[i]);
            //(괄호)를 쓰지 않을 시, 문자열 덧셈부터 적용되므로, i + 1이 정수형 방식으로 계산되지 않는다
        }

        //2차원 배열
        int[][] arrTD = new int[2][3]; //[row][col]
        int[][] arrTD2 = {
                {1,2,3},
                {4,5,6}
        };  //간략화: 한 라인에서 초기화 동시에 진행
        for (int i = 0; i < arrTD2.length; i++) { //alt + 엔터 : 향상된 for문으로 변경
            for (int j = 0; j < arrTD2[i].length; j++) { //특정 행의 열 접근
                System.out.print(arrTD2[i][j]+" ");
            }
            System.out.println();
        }

        //향상된 for문(for each문) //스니펫 iter
        int[] numbers = {1, 2, 3, 4, 5};
        for (int value: numbers) { //인덱스 사용 불필요; 요소 이름: 배열 또는 컬렉션
            System.out.println(value);
        }
    }
}

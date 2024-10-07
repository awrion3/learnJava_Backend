package basic;

public class Typecast {
    public static void main(String[] args) {
        // from small to big 대입 문제 없음. (int < long << double) 자동 묵시적 형변환
        int iValue = 10;
        double dValue = iValue;
        System.out.println("doubleValue = " + dValue);
        long lValue = 100000000000L;
        double dValue2 = lValue;
        System.out.println("doubleValue2 = " + dValue2);

        //from big to small
        double dValue3 = 10.5;
        //int iValue1 = dValue3; imcompitable types 에러 발생: 데이터 손실 문제 경고
        int iValue2 = (int) dValue3; //가능하게 하려면 명시적 형변환 필요: 소수점 버림
        //대입하는 값을 형 변환한다고 해서 대입하려는 값 자체가 변환되는 것은 아니다
        long lValue2 = 1000000000000L;
        int iValue3 = (int) lValue2;
        System.out.println("iValue3 = " + iValue3);
        //다만 명시적 형변환을 해도 범위를 넘어서는 값이라면 오버플로우 문제 발생
        //대입하는 변수 타입을 더 큰 사이즈로 늘려야 한다

        //계산에서의 형변환
        //(같은 타입끼리의 계산은 같은 타입의 결과)
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);
        //(서로 다른 타입의 계산은 큰 범위로 자동 형변환 발생*)
        double div2 = 3 / 2; //int끼리로 int 결과값->double로의 대입 연산*되므로 자동 형변환에 의해 double 값화
        System.out.println("div2 = " + div2);

        int a = 3, b = 2;
        double div3 = (double) a / b;
        //a를 double로 강제 형변환 함에 따라, double/int값*이므로 자동 형변환에 의해 double 결과값 발생하여 그대로 대입
        System.out.println("div3 = " + div3);

        double div4 = 3.0 / 2; //double/int 연산이므로 자동 형변환에 의해 double 결과값 발생
        System.out.println("div4 = " + div4);
    }
}
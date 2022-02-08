import java.util.Scanner;

/* CodeUP 1045 : [기초-산술연산] 정수 2개 입력받아 합과 평균 출력
 *  입력 : 정수 2개 입력 (단,  0 <= a, b <= 2147483647, b는 0이 아니다.)
 *  출력 : 첫 줄에 합, 둘째 줄에 차, 셋째 줄에 곱, 넷째 줄에 몫, 다섯째 줄에 나머지, 여섯째 줄에 나눈 값을 순서대로 출력
 *  (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
 *  입력예시) 10 3 -> 출력예시) 13
 *                           7
 *                           30
 *                           3
 *                           1
 *                           3.33
 * */
public class arithmetic_1045 {
    public static void main(String[] args) {
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
            try {
                int a = sc.nextInt();
                if (a >= 0 && a <= 2147483647) { // 첫번째 입력값이 조건에 해당할 경우
                    System.out.print("두번째 정수를 입력하시오 : ");
                    int b = sc.nextInt();
                    if (b >= 0 && b <= 2147483647 && b!=0) { //두번째 입력값이 조건에 해당할 경우

                        int add = a+b;
                        int sub = a-b;
                        int mul = a*b;
                        int mok =  a/b;
                        int na =  a%b;
                        double nagap = (double) a/b;

                        System.out.println("합 : "+add);
                        System.out.println("차 : "+sub);
                        System.out.println("곱 : "+mul);
                        System.out.println("몫 : "+mok);
                        System.out.println("나머지 : "+na);
                        System.out.println("나눈값 : "+String.format("%.2f",nagap));

                    } else System.out.println("범위 안의 정수로 다시 입력하세요."); //두번째 입력값이 조건에 해당하지 않을 경우
                } else System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 조건에 해당하지 않을 경우
            }catch (Exception e) {
                System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 int 범위를 벗어났을때}
            }
    }
}


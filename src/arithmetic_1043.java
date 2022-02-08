import java.util.Scanner;

/* CodeUP 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력
 *  입력 : 정수 2개 입력 (단, - <= a <= b <= +2147483647 / b는 0이 아니다)
 *  출력 : a를 b로 나머지 몫을 출력
 *  입력예시) 10 3 -> 출력예시) 1
 * */
public class arithmetic_1043 {
    public static void main(String[] args) {
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);

        try {
        int a = sc.nextInt();
            if (a >= 0 && a <= 2147483647) { // 첫번째 입력값이 조건에 해당할 경우
                System.out.print("두번째 정수를 입력하시오 : ");
                int b = sc.nextInt();
                if (b >= 0 && b <= 2147483647 && b != 0) { //두번째 입력값이 조건에 해당할 경우
                    System.out.println("나머지 : " + (a % b));
                } else System.out.println("입력 값이 범위 안의 수이면서 0이 아니여야합니다."); //두번째 입력값이 조건에 해당하지 않을 경우
            } else System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 조건에 해당하지 않을 경우
        }catch (Exception e){
            System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 int 범위를 벗어났을때
        }
    }
}

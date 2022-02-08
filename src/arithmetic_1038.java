import java.util.Scanner;

/* CodeUP 1038 : [기초-산술연산] 정수 2개 입력받아 합 출력
 *  입력 : 정수 2개가 입력 (단, -1073741824 ~ 1073741824 범위)
 *  출력 : 두 정수의 합을 출력
 *  입력예시) 123 -123 -> 출력예시) 0
 * */
public class arithmetic_1038 {
    public static void main(String[] args) {
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a>=-1073741824 && a<=1073741824){ //첫번째 입력값이 범위 안일때

            System.out.print("두번째 정수를 입력하시오 : ");
            int b = sc.nextInt();

            if(b>=-1073741824 && b<=1073741824){ //두번째 입력값이 범위 안일때
                System.out.println("합 : " +(a+b));

            }else System.out.print("범위 내 숫자를 입력하시오."); //두번째 입력값이 범위 밖일때

        }else System.out.print("범위 내 숫자를 입력하시오.");//첫번째 입력값이 범위 밖일때
    }
}

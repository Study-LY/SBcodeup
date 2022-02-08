import java.util.Scanner;

/* CodeUP 1039 : [기초-산술연산] 정수 2개 입력받아 합 출력2
 *  입력 : 정수 2개가 입력 (단, -2147483648 ~ +214748368 범위)
 *  출력 : 두 정수의 합을 출력
 *  입력예시) 2147483648 + 2147483648 -> 출력예시)4294967296
 *  주의) 계산된 결과가 int 형으로 저장할 수 있는 범위를 넘어갈 수 있기 때문에 다른 데이터형을 사용
 * */
public class arithmetic_1039 {
    public static void main(String[] args){
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        if(a>=-2147483648 && a<=2147483648L){ //첫번째 입력값이 범위 안일때

            System.out.print("두번째 정수를 입력하시오 : ");
            long b = sc.nextLong();

            if(b>= -2147483648 && b<=2147483648L){ //두번째 입력값이 범위 안일때
                System.out.println("합 : " +(a+b));

            }else System.out.print("범위 내 숫자를 입력하시오."); //두번째 입력값이 범위 밖일때

        }else System.out.print("범위 내 숫자를 입력하시오.");//첫번째 입력값이 범위 밖일때
    }
}

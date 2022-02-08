import java.util.Scanner;

/* CodeUP 1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력2
 *  입력 : 정수 1개가 입력 (단, -2147483647 ~ +214748367 범위)
 *  출력 : 두 정수의 합을 출력
 *  입력예시) -1 -> 출력예시) 1
 * */
public class arithmetic_1040 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i>=-2147483647 && i<=2147483647) {
            System.out.print(-i);
        }else System.out.println("범위 내 정수를 입력하시오.");
    }
}

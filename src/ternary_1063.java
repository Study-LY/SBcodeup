import java.util.Scanner;

/* CodeUP 1063 : [기초-삼항연산] 두 정수 입력받아 큰 수 출력
 *  입력 : 정수 2개 입력(단, 입력 범위는 -2147483648 ~ +2147483647)
 *  출력 : 두 정수 중 큰 값을 10진수로 출력
 *  입력예시) 123 456 -> 출력예시) 456
 *  주의) 비교시 if 금지
 * */
public class ternary_1063 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            if (num1 >= -2147483648 && num1 <= 2147483647) {
                System.out.print("정수를 입력하시오 : ");
                int num2 = sc.nextInt();
                if (num2 >= -2147483648 && num2 <= 2147483647) {
                    System.out.println(num1>num2?num1:num2); //삼항연산자 -> 조건식?참:거짓
                }else System.out.println("범위 안의 정수로 다시 입력하세요.");
            } else System.out.println("범위 안의 정수로 다시 입력하세요.");
        } catch (Exception e) {
            System.out.println("범위 안의 정수로 다시 입력하세요."); //입력값이 int 범위를 벗어났을때}
        }
    }

}

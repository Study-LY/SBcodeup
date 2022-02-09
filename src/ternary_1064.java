import java.util.Scanner;

/* CodeUP 1064 : [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력
 *  입력 : 정수 3개 입력(단, 입력 범위는 -2147483648 ~ +2147483647)
 *  출력 : 가장 작은 값을 출력
 *  입력예시) 3 -1 5 -> 출력예시) -1
 *  주의) 비교시 if 금지
 * */
public class ternary_1064 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            if (num1 >= -2147483648 && num1 <= 2147483647) {
                System.out.print("정수를 입력하시오 : ");
                int num2 = sc.nextInt();
                if (num2 >= -2147483648 && num2 <= 2147483647) {
                    System.out.print("정수를 입력하시오 : ");
                    int num3 = sc.nextInt();
                    if (num3 >= -2147483648 && num3 <= 2147483647) {
                        System.out.println((num1<num2?num1:num2)<num3?(num1<num2?num1:num2):num3); //삼항연산자 -> 조건식?참:거짓
                    }else System.out.println("범위 안의 정수로 다시 입력하세요.");
                }else System.out.println("범위 안의 정수로 다시 입력하세요.");
            } else System.out.println("범위 안의 정수로 다시 입력하세요.");
        } catch (Exception e) {
            System.out.println("범위 안의 정수로 다시 입력하세요."); //입력값이 int 범위를 벗어났을때}
        }
    }
}

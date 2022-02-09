import java.util.Scanner;

/* CodeUP 1062 : [기초-비트단위논리연산] 비트단위로 XOR하여 출력
 *  입력 : 정수 2개 입력(단, 입력 범위는 -2147483648 ~ +2147483647)
 *  출력 : 두 정수를 비트단위(bitwise)로 XOR 계산을 수행한 결과를 10진수로 출력
 *  입력예시) 3 5 -> 출력예시) 6
 *  참고 ) 비트단위(bitwise) 연산자 : ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor), <<(bitwise left shift), >>(bitwise right shift)
 * */
public class bitlogical_1062 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            if (num1 >= -2147483648 && num1 <= 2147483647) {
                System.out.print("정수를 입력하시오 : ");
                int num2 = sc.nextInt();
                if (num2 >= -2147483648 && num2 <= 2147483647) {
                    System.out.println(num1 ^ num2);
                }else System.out.println("범위 안의 정수로 다시 입력하세요.");
            } else System.out.println("범위 안의 정수로 다시 입력하세요.");
        } catch (Exception e) {
            System.out.println("범위 안의 정수로 다시 입력하세요."); //입력값이 int 범위를 벗어났을때}
        }
    }
}

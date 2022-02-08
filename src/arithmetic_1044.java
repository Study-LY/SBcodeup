import java.util.Scanner;

/* CodeUP 1044 : [기초-산술연산] 정수 1개 입력받아 1 더해 출력
 *  입력 : 정수 1개 입력 (단, -2147483648 ~ +2147483647 범위)
 *  출력 : 입력된 정수에 1을 더해 출력
 *  입력예시) 2147483647 -> 출력예시) 2147483648
 *  주의) 계산되고 난 후의 값의 범위(데이터형)
 * */
public class arithmetic_1044 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);

        long i = sc.nextLong();
        System.out.println(i+1);

    }
}

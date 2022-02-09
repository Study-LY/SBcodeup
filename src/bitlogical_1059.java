import java.util.Scanner;

/* CodeUP 1059 : [기초-비트단위논리연산] 비트단위로 NOT하여 출력
 *  입력 : 정수 1개 입력(단, 입력 범위는 -2147483648 ~ +2147483647)
 *  출력 : 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력
 *  입력예시) 2 -> 출력예시) -3
 *  참고 ) 비트단위(bitwise) 연산자 : ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor), <<(bitwise left shift), >>(bitwise right shift)
 * */
public class bitlogical_1059 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a >= -2147483648 && a <= 2147483647) {
                System.out.println(~a);
            } else System.out.println("범위 안의 정수로 다시 입력하세요.");
        }catch (Exception e) {
            System.out.println("범위 안의 정수로 다시 입력하세요."); //입력값이 int 범위를 벗어났을때}
        }
    }
}

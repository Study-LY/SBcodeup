import java.util.Scanner;

/* CodeUP 1031 : [기초-출력변환] 10진수 정수 1개 입력받아 8진수 출력
 *  입력 : 10진수 1개가 입력 (단, 입력되는 정수는 int 범위)
 *  출력 : 8진수로 출력
 *  입력예시) 10 -> 출력예시) 12
 * */
public class conversion_1031 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%o",num);
    }
}

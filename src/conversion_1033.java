import java.util.Scanner;

/* CodeUP 1033 : [기초-출력변환] 10진수 정수 1개 입력받아 16진수 출력2
 *  입력 : 10진수 1개가 입력 (단, 입력되는 정수는 int 범위)
 *  출력 : 16진수(대문자)로 출력
 *  입력예시) 255 -> 출력예시) FF
 * */
public class conversion_1033 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%X",num);
    }
}

import java.util.Scanner;

/* CodeUP 1037 : [기초-출력변환] 정수 1개 입력받아 아스키문자 출력
 *  입력 : 10진 정수 1개가 입력 (단, 0~ 255범위)
 *  출력 : 아스키코드 값 문자로 출력
 *  입력예시) 65 -> 출력예시) A
 * */
public class conversion_1037 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print((char) num);
    }
}

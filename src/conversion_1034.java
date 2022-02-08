import java.util.Scanner;

/* CodeUP 1034 : [기초-출력변환] 8진수 1개 입력받아 10진수 출력
 *  입력 : 8진수 1개가 입력
 *  출력 : 10진수로 출력
 *  입력예시) 13 -> 출력예시) 11
 * */
public class conversion_1034 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(8); //nextInt()은 default로 10진수임, 8쓰면 8진수, 16쓰면 16진수 연산
        System.out.printf("%d",num);
    }
}

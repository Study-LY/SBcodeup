import java.util.Scanner;

/* CodeUP 1035 : [기초-출력변환] 16진수 1개 입력받아 8진수 출력
 *  입력 : 16진수(영문 소문자) 1개가 입력
 *  출력 : 8진수로 출력
 *  입력예시) f -> 출력예시) 17
 * */
public class conversion_1035 {
    public static void main(String[] args) {
        System.out.print("16진수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(16); //nextInt()은 default로 10진수임, 8쓰면 8진수, 16쓰면 16진수 연산
        System.out.printf("%o",num); //8진수인 %o로 출력
    }
}

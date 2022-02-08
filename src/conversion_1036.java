import java.util.Scanner;

/* CodeUP 1036 : [기초-출력변환] 영문자 1개 입력받아 8진수 출력
 *  입력 : 영문자 1개가 입력
 *  출력 : 아스키코드 값 10진수 출력
 *  입력예시) A -> 출력예시) 65
 * */
public class conversion_1036 {
    public static void main(String[] args) {
        System.out.print("영문자 1개 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // 입력받은 sc를 charAt을 이용하여 char로 변환
        System.out.print((int)c); //문자를 int로 형변환
    }
}

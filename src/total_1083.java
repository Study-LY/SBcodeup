import java.util.Scanner;

/* CodeUP 1083 : [기초-종합] 3 6 9 게임의 왕이 되자!
 *  입력 : 10보다 작은 정수 1개 입력(단, 1~9의 범위)
 *  출력 : 1부터 그 수까지 순서대로 공백을 두고 수를 출력하는데
 *        3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X를 출력
 *  입력예시) 9  -> 출력예시) 1 2 X 4 5 X 7 8 X
 * */
public class total_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int num = sc.nextInt();
        if(num>=1 && num<=9) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0) {
                    System.out.print(" X ");
                } else System.out.print(" " + i + " ");
            }
        }else System.out.print("1~9 사이의 수를 입력하시오.");
    }
}

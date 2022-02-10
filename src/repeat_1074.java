import java.util.Scanner;

/* CodeUP 1074 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력
 *  입력 : 정수 1개 입력(단, 입력 범위는 1 ~ 100)
 *  출력 : 1씩 줄이면서 한줄에 하나씩 1이 될때까지 출력
 *  입력예시) 5 -> 출력예시) 5
 *                        4
 *                        3
 *                        2
 *                        1
 * */
public class repeat_1074 {
    public static void main(String[] args) {
        System.out.print("정수입력 : ");
        Scanner sc = new Scanner(System.in);
            try {
                int num = sc.nextInt();
                if (num >= 0 && num <= 100) {
                    while (true) {
                        if (num == 0) {
                            break;
                        }
                        System.out.println(num);
                        num -= 1;
                    }
                }
            } catch (Exception e) {
                System.out.println("다시 입력하시오.");
            }

    }
}

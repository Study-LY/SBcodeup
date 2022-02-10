import java.util.Scanner;

/* CodeUP 1077 : [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력
 *  입력 : 정수 1개 입력(0~100)
 *  출력 : 0부터 입력한 숫자까지 순서대로 줄 바꿔 출력
 *  입력예시)  4 -> 출력예시) 0
 *                         1
 *                         2
 *                         3
 *                         4
 * */
public class repeat_1077 {
    public static void main(String[] args) {
        System.out.print("정수입력 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                for(int i = 0; i<=num; i++){
                    System.out.println(i);
                }
            }else System.out.println("다시 입력하시오.");
        } catch (Exception e) {
            System.out.println("다시 입력하시오.");
        }

    }
}

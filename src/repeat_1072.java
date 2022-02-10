import java.util.Scanner;

/* CodeUP 1072 : [기초-반복실행구조] 정수 입력받아 계속 출력
 *  입력 : 정수 입력(단, 입력 범위는 -2147483648 ~ +2147483647 / 갯수는 알 수 없다.)
 *  출력 : 입력된 정수를 순서대로 출력
 *  입력예시) 121 246 28 3  -> 출력예시) 121
 *                                    246
 *                                    28
 *                                    3
 * */
public class repeat_1072 {
    public static void main(String[] args) {
        System.out.print("정수입력 : ");
        Scanner sc = new Scanner(System.in);

        try {
            int num=sc.nextInt() ; //입력된 정수
            int count=sc.nextInt(); // 갯수 확인
            if (num >= -2147483648 && num <= 2147483647) {
                for (int i=0; i<count; i++){
                    System.out.println(num);
                }
            }
        }catch (Exception e) {
            System.out.println("다시 입력하시오.");
        }
    }

}

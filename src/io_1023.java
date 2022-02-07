import java.util.Scanner;

/* CodeUP 1023 : [기초-입출력] 실수1개 입력받아 부분별로 출력
 *  입력 : 실수 1개 입력
 *  단, 입력되는 값은 10000을 넘지 않음
 *  출력 : 첫번째 줄에 정수 부분, 두 번째 줄에 실수 부분 출력
 *  입력예시) 1.4141213 -> 출력예시) 1
 *                                414213
 * */
public class io_1023 {
    public static void main(String[] args) {
        System.out.print("실수 1개를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String[] i = sc.next().split("\\.");

        for(String a : i) {
            System.out.println(a);
        }
    }
}

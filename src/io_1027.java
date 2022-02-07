import java.util.Scanner;

/* CodeUP 1027 : [기초-입출력] 년월일 입력받아 형식 바꿔 출력
 *  입력 : 년월일이 '.'(닷)으로 구분되어 입력
 *  출력 : 일월년으로 바꿔'-'(대쉬, 마이너스)로 구분 출력
 *  입력예시) 2022.02.07 -> 출력예시) 07-02-2022
 * */
public class io_1027 {
    public static void main(String[] args) {
        System.out.print("년.월.일을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String[] ymd = sc.next().split("\\.");//사용자가 입력한 단어를 구분자(".")기준으로 나눠 배열 ymd 에 각각 담기

        System.out.print(ymd[2]+"-"+ymd[1]+"-"+ymd[0]);
    }
}

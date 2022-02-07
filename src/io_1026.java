import java.util.Scanner;

/* CodeUP 1026 : [기초-입출력] 시분초 입력받아 분 출력
 *  입력 : 시:분:초 형식으로 입력
 *  출력 : 분만 출력
 *  입력예시) 22:44:25 -> 출력예시) 44
 * */
public class io_1026 {
    public static void main(String[] args) {
        System.out.print("시:분:초를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String[] i = sc.next().split(":"); //사용자가 입력한 단어를 구분자(":")기준으로 나눠 배열 i 에 각각 담기

        System.out.println(i[1]); //분에 해당하는 1번 index값 출력
    }
}

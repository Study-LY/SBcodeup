import java.util.Scanner;

/* CodeUP 1030 : [기초-데이터형] 정수 1개 입력받아 그대로 출력3
 *  입력 : 정수 1개 입력 (단, -9223372036854775808 ~ +922337203685477580 범위의 실수)
 *  출력 : 입력된 정수를 그대로 출력
 *  입력예시) -2147483649 -> 출력예시) -2147483649
 *  C에서 LongLong int 사용하지만 java는 지원하지 않아 long으로 대체
 *
 * */
public class Datatype_1030 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();

    }
}

import java.util.Scanner;

/* CodeUP 1028 : [기초-데이터형] 정수 1개 입력받아 그대로 출력2
 *  입력 : 정수 1개 입력 (단, 0 ~ +4294967295  범위의 정수)
 *  출력 : 입력된 정수 그대로 출력
 *  입력예시) 2147483648 -> 출력예시) 2147483648
 * */
public class Datatype_1028 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
            System.out.println("입력한 정수 : "+i);
    }
}

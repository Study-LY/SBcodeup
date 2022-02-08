import java.util.Scanner;

/* CodeUP 1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력2
 *  입력 : 실수 1개 입력 (단, +- 1.7*10-308 ~ +- 1.7*10308 범위의 실수)
 *  출력 : 입력된 실수를 소수점 이하 11자리까지 반올림 출력
 *  입력예시) 3.14159265359 -> 출력예시) 3.14159265359
 * */
public class Datatype_1029 {
    public static void main(String[] args) {
        System.out.print("실수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.printf("%.11f",num);
    }
}

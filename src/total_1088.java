import java.util.Scanner;

/* CodeUP 1088 : [기초-종합] 3의 배수는 통과?
 *  입력 : 정수 1개를 입력(단, 1~100)
 *  출력 : 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
 *        3의 배수는 출력하지 않음
 *  입력예시) 10  -> 출력예시) 1 2 4 5 7 8 10
 * */
public class total_1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int num = sc.nextInt();
        if(num>=1 && num<=100) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0) {
                   continue;
                } else System.out.print(" " + i + " ");
            }
        }else System.out.print("1~100 사이의 수를 입력하시오.");
    }

}

import java.util.Scanner;

/* CodeUP 1051 : [기초-비교연산] 두 정수 입력받아 비교3
 *  입력 : 정수 2개 입력 (단, -2147483648 <= a, b <= +2147483647 )
 *  출력 : b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력
 *  입력예시) 0 -1 -> 출력예시) 0
 * */
public class compare_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        try {
            int a = sc.nextInt();
            if(a>=-2147483648 && a<=2147483647){
                System.out.print("정수를 입력하시오. : ");
                int b = sc.nextInt();
                if(b>=-2147483648 && b<=2147483647){
                    if(a<=b){
                        System.out.println(1);
                    }else System.out.println(0);
                }else System.out.println("범위 안의 숫자를 입력하시오.");
            }else System.out.println("범위 안의 숫자를 입력하시오.");
        }catch(Exception e){
            System.out.println("다시 입력하시오.");
        }
    }
}

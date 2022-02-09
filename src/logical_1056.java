import java.util.Scanner;

/* CodeUP 1056 : [기초-논리연산] 참/거짓이 서로 다를때만 참 출력
 *  입력 : 1 또는 0의 값만 가지는 2개의 정수 입력
 *  출력 : 참/거짓이 서로 다를 경우 1, 그 외의 경우에는 0을 출력
 *  입력예시) 1 1 -> 출력예시) 0
 * */
public class logical_1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1 == 0  || num1==1) {
            int num2 = sc.nextInt();
            if(num2 == 0  || num2==1) {
                if (num1 != num2) {
                    System.out.println(1);
                } else System.out.println(0);
            }else System.out.println("0 또는 1의 정수를 입력하시오.");
        }else System.out.println("0 또는 1의 정수를 입력하시오.");
    }
}
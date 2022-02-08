import java.util.Scanner;

/* CodeUP 1042 : [기초-산술연산] 정수 2개 입력받아 나눈 몫 출력
 *  입력 : 정수 2개 입력 (단, -2147483648 <= a <= b <= +2147483647)
 *  출력 : a를 b로 나눈 몫을 출력
 *  입력예시) 1 3 -> 출력예시) 0
 * */
public class arithmetic_1042 {
    public static void main(String[] args) {
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
        int a = sc.nextInt();
        if(a>=-2147483647 && a<=2147483647){ // 첫번째 입력값이 조건에 해당할 경우
            System.out.print("두번째 정수를 입력하시오 : ");
            int b = sc.nextInt();
            if(b>=-2147483647 && b<=2147483647 && b!=0){ //두번째 입력값이 조건에 해당할 경우
                System.out.println("몫 : "+(a/b));
            }else System.out.println("입력 값이 범위 안의 수이면서 0이 아니여야합니다."); //두번째 입력값이 조건에 해당하지 않을 경우
        }else System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 조건에 해당하지 않을 경우
        }catch (Exception e){
            System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 int 범위를 벗어났을때
        }
    }
}

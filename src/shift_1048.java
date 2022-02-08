import java.util.Scanner;

/* CodeUP 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력
 *  입력 : 정수 2개 입력 (단, 0 <= a, b <= 10 )
 *  출력 : a 를 2b배 만큼 곱한 값을 출력
 *  입력예시) 1 3 -> 출력예시) 8
 * */
public class shift_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int a = sc.nextInt();
        if(a>=0 && a<=10){
            System.out.print("거듭제곱 수를 입력하시오 : ");
            int b = sc.nextInt();
            if(b>=0 && b<=10){
                System.out.println("2의 거듭제곱 연산 결과 : "+(a<<b));
            }
        }else System.out.println("0~10 사이의 수를 입력하세요.");
    }
}

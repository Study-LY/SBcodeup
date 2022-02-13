import java.util.Scanner;

/* CodeUP 1081 : [기초-종합] 주사위를 2개 던지면?
 *  입력 : 주사위 2개의 면의 개수 n,m 입력(단, n,m은 10이하의 자연수)
 *  출력 : 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 출력
 *        첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력
 *  입력예시) 2 3  -> 출력예시) 1 1
 *                           1 2
 *                           1 3
 *                           2 1
 *                           2 2
 *                           2 3
 * */
public class total_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int num1 = sc.nextInt(); // 첫번째 수를 담는 변수
        int num2 = sc.nextInt(); // 두번째 수를 담는 변수
        for(int i = 1; i<=num1; i++){ // i가 첫번째 값보다 작거나 같을때까지 증가
            for(int j = 1; j<=num2; j++){ //j가 두번째 값보다 작거나 같을때까지 증가
                System.out.println(i+" "+j); //증가되었던 값 i,y출력
            }
        }
    }
}

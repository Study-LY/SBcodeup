import java.util.Scanner;

/* CodeUP 1087 : [기초-종합] 여기까지! 이제 그만~
 *  입력 : 정수 1개를 입력(단, 입력되는 자연수는 100,000,000이하)
 *  출력 : 1,2,3,4,5,... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
 *        그때까지의 합 출력
 *  입력예시) 57  -> 출력예시) 66
 * */
public class total_1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int num = sc.nextInt(); // 입력된 정수(num)
        int sum=0; // 합을 구하고자 변수 선언
        for(int i = 1; i <=num; i++){ // 언제까지 계산할지 1,2,3,4 순서대로 더해가는 수
            sum+=i; //sum=sum+i
            if(sum>=num){ //sum(합)이 입력된 정수(num)보다 커지거나 같을때
                break; // 멈춤
            }

        }System.out.print(sum);
    }
}

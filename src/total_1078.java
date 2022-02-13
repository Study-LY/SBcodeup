import java.util.Scanner;

/* CodeUP 1078 : [기초-종합] 짝수 합 출력
 *  입력 : 정수 1개 입력(0~100)
 *  출력 : 1부터 입력한 숫자까지 짝수의 합을 출력
 *  입력예시)  5 -> 출력예시) 6
 * */
public class total_1078 {
    public static void main(String[] args) {
        System.out.print("정수입력 : ");
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sum = 0; //짝수의 합 저장 변수
            if (num >= 0 && num <= 100) { //입력하는 값이 범위 안의 수인 경우
                for(int i = 0; i<=num; i++){//입력한 값의 끝을 알기 위함
                    if(i%2==0) {// 입력한 값의 나머지가 0인(짝수일때)
                        sum+=i; //sum변수에 짝수인 값 더하기
                    }
                }System.out.println(sum);
            }else System.out.println("다시 입력하시오.");

    }
}

import java.util.Scanner;

/* CodeUP 1080 : [기초-종합] 언제까지 더해야 할까?
 *  입력 : 정수 1개 입력
 *  출력 : 1,2,3,4,5,... 를 순서대로 계속 더해 합을 만들다가
 *         입력된 정수(0~1000)와 같거나 커졌을 때, 마지막에 더한 정수 출력
 *  입력예시) 55  -> 출력예시) 10
 * */
public class total_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int num = sc.nextInt(); //입력한 정수
        int sum=0;
        for (int i = 1; i<1000; i++){  //입력된 정수가 0~ 1000이내
            sum=sum+i;

            if(sum>=num){ //더한 값이 입력된 정수보다 같거나 커졌을때
                System.out.println(i); //더해지고 있던 i를 출력
                break;
            }
        }

    }
}

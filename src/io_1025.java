import java.util.Scanner;

/* CodeUP 1025 : [기초-입출력] 정수 1개 입력받아 나누어 출력
 *  입력 : 다섯 자리로 이루어진 1개 정수 입력(단, 10,000<=입력받는 수 <=99,999)
 *  출력 : 각 자리의 숫자를 분리해 한 줄에 하나씩 []속에 넣어 출력
 *  입력예시) 75274 -> 출력예시) [70000]
 *                            [5000]
 *                            [200]
 *                            [50]
 *                            [4]
 * */
public class io_1025 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i>=10000 && i<=99999){ //입력받은 수가 범위 안의 수일 경우
            int num1 = (i/10000)*10000; // 만의 자리 수 구하기
            int num2 = (i-num1)/1000*1000; // 천의 자리 수 구하기
            int num3 = (i-num1-num2)/100*100; // 백의 자리 수 구하기
            int num4 = (i-num1-num2-num3)/10*10; // 십의 자리 수 구하기
            int num5 = (i-num1-num2-num3-num4); // 일의 자리 수 구하기
            System.out.println("["+num1+"]");
            System.out.println("["+num2+"]");
            System.out.println("["+num3+"]");
            System.out.println("["+num4+"]");
            System.out.println("["+num5+"]");
        }else System.out.println("범위안의 수를 입력하시오."); //입력받은 수가 범위 밖의 수일 경우
    }
}

import java.util.Scanner;

/* CodeUP 1092 : [기초-종합] 함께 문제 푸는 날
 *  입력 : 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기 입력
 *  출력 : 3명이 다시 모두 함께 방문해 문제 풀어보는 날(동시가입/등업 후 며칠 후?)출력
 *  입력예시) 3 7 9 -> 출력예시) 63
 * */
public class total_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3명이 규칙적으로 방문하는 주기를 입력하시오. : ");
        int num1 = sc.nextInt(); //첫번째 사람의 방문 주기
        int num2 = sc.nextInt(); //두번째 사람의 방문 주기
        int num3 = sc.nextInt(); //세번째 사람의 방문 주기

        int day = 1;

        while(day%num1!=0 || day%num2!=0 || day%num3!=0){
            day++;
        }System.out.println("모두 방문하는 날은 "+day+"일 후 입니다.");
    }
}

import java.util.Scanner;

/* CodeUP 1093 : [기초-1차원 배열] 이상한 출석 번호 부르기1
 *  입력 : 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력. (1 ~ 10000)
          두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력
 *  출력 : 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력
 *  입력예시) 10
 *          1 3 2 2 5 6 7 4 5 9 -> 출력예시) 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * */
public class array_1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출석번호를 부른 횟수와 부른 출석번호를 입력하시오. : ");
        int num = sc.nextInt(); // 출석번호 부른 횟수
        int[] arr = new int[24];

        for(int i=1; i<=num; i++){
            int num2 = sc.nextInt(); // 부른 출석 번호
            arr[num2-1] += +1;
        }
        for(int i=1; i<=23; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

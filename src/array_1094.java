import java.util.Scanner;

/* CodeUP 1094 : [기초-1차원 배열] 이상한 출석 번호 부르기2
 *  입력 : 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력. (1 ~ 10000)
          두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력
 *  출력 : 1번부터 번호가 불린 횟수를 순서를 바꿔 공백으로 구분하여 한 줄로 출력
 *  입력예시) 10
 *          10 4 2 3 6 6 7 9 8 5 -> 출력예시) 5 8 9 7 6 6 3 2 4 10
 * */
public class array_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출석번호를 부른 횟수와 부른 출석번호를 입력하시오. : ");
        int num = sc.nextInt(); // 출석번호 부른 횟수
        int[] arr = new int[num]; //입력된 값 만큼 배열 크기 지정

        for(int i=1; i<=num; i++){ // i가 입력된 수만큼 반복
            arr[i] = sc.nextInt(); // 횟수만큼 입력 받고, 배열생성
        }
        for(int i=num-1; i>0; i--){ // 배열의 뒤쪽에서부터 인덱스 값이 감소하면서
            System.out.print(arr[i]+" "); // 배열에 저장된 값 출력
        }
    }
}

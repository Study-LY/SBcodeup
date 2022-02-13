import java.util.Scanner;

/* CodeUP 1089 : [기초-종합] 수 나열하기1
 *  입력 : 시작 값(a), 등차 값(d), 몇 번째 수인지 의미하는 정수(n) 입력(단, 0~ 100)
 *  출력 : n번째 수 출력
 *  입력예시) 1 3 5  -> 출력예시) 13
 * */
public class total_1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작값(a), 등차 값(d), 몇번째 수(n)을 입력하시오. : ");
        String[] mun = sc.nextLine().split(" ");
        int a = Integer.valueOf(mun[0]);
        int d = Integer.valueOf(mun[1]);
        int n = Integer.valueOf(mun[2]);

        for (int i = 1; i<n; i++){
            a+=d;
        }System.out.print(a);

    }
}

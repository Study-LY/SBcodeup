import java.util.Scanner;

/* CodeUP 1091 : [기초-종합] 수 나열하기3
 *  입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 수인지 의미하는 정수(n) 입력(단, 0~ 100)
 *  출력 : n번째 수 출력
 *  입력예시) 1 -2 1 8  -> 출력예시) -85
 * */
public class total_1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 값(a), 곱할 값(m), 더할 값(d), 몇번째 수(n)을 입력하시오. : ");
        String[] mun = sc.nextLine().split(" ");
        int a = Integer.valueOf(mun[0]); // 시작
        int m = Integer.valueOf(mun[1]);//곱
        int d = Integer.valueOf(mun[2]);//합
        int n = Integer.valueOf(mun[3]);//몇번째
        for (int i = 1; i<n; i++){
            a = a * m + d;
        }
        System.out.println(a);
    }
}

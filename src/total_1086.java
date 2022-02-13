import java.util.Scanner;

/* CodeUP 1086 : [기초-종합] 그림 파일 저장용량 계산
 *  입력 : w, h, b입력(단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수)
 *  출력 : 필요한 저장 공간을 MB 단위로 바꾸어 출력
 *         (단, 소수점 셋째 자리에서 반올림해 둘째 자리까지 출력하고 MB를 공백을 두고 출력)
 *  입력예시) 1024 768 24  -> 출력예시) 2.25 MB
 * */
public class total_1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("w, h, b를 각각 입력하시오. : ");
        String[] mun = sc.nextLine().split(" ");
        double w = Double.valueOf(mun[0]);
        double h = Double.valueOf(mun[1]);
        double b = Double.valueOf(mun[2]);

        double total = (w*h*b)/8/1024/1024;
        System.out.printf("%.2fMB",total);
    }
}

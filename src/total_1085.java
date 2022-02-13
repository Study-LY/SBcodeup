import java.util.Scanner;

/* CodeUP 1085 : [기초-종합] 소리 파일 저장용량 계산
 *  입력 : h, b, c, s입력(단, h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수)
 *  출력 : 필요한 저장 공간을 MB 단위로 바꾸어 출력
 *         (단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력)
 *  입력예시) 44100 16 2 10  -> 출력예시) 1.7 MB
 * */
public class total_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("h, b, c, s를 각각 입력하시오. : ");
        String[] mun = sc.nextLine().split(" ");
        double h = Double.valueOf(mun[0]); // 각각의 배열에 저장된 값은 double 형으로 변환하여 각각의 변수에 저장
        double b = Double.valueOf(mun[1]);
        double c = Double.valueOf(mun[2]);
        double s = Double.valueOf(mun[3]);

        double hap = (h*b*c*s)/ 8 / 1024/1024; //(h*b*c*s) 저장공간 / 8bit(=1byte) / 1024(1024byte=1KB) / 1024kB(=1MB)
        System.out.printf("%.1fMB",hap);

    }
}

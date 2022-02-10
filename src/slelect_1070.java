import java.util.Scanner;

/* CodeUP 1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력
 *  입력 : 월을 의미하는 1개 정수 입력(단, 1~ 12)
 *  출력 : 계절 이름 출력 (12,1,2 : winter / 3,4,5 : spring / 6,7,8 : summer / 9,10,11 : fall)
 *  입력예시) 12 -> 출력예시) winter
 *  참고 ) switch~ case문 이용
 * */
public class slelect_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력하시오. : ");
        int num = sc.nextInt();

            switch (num){
                case 12 :
                case 1:
                case 2 : System.out.println("winter"); break;
                case 3 :
                case 4 :
                case 5 : System.out.println("spring"); break;
                case 6 :
                case 7 :
                case 8 : System.out.println("summer"); break;
                case 9 :
                case 10 :
                case 11 : System.out.println("fall"); break;
                default : System.out.println("다시입력하시오.");
            }


    }
}

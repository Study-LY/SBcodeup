import java.util.Scanner;

/* CodeUP 1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력
 *  입력 : 영문자 1개 입력(단, A,B,C,D 등 한 문자)
 *  출력 : 평가내용에 따라 다른 내용 출력 ( A : best!!! / B : good!!! / C : run! / D : slowly~ / 나머지 : what? 출력)
 *  입력예시) A -> 출력예시) best!!!
 *  참고 ) switch~ case문 이용
 * */
public class slelect_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하시오. : ");
        char i = sc.next().charAt(0);
        switch (i){
            case 'A' : System.out.println("bset!!!");  break;
            case 'B' : System.out.println("good!!!");  break;
            case 'C' : System.out.println("run!");  break;
            case 'D' : System.out.println("slowly~");  break;
            default: System.out.println("what?");
        }
    }
}

import java.util.Scanner;

/* CodeUP 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력
 *  입력 : 영문자 1개 입력
 *  출력 : 다음 문자 출력
 *  입력예시) a -> 출력예시) b
 * */
public class arithmetic_1041 {
    public static void main(String[] args) {
        System.out.print("문자를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        c +=1; //c=c+1
        System.out.println(c);
    }
}

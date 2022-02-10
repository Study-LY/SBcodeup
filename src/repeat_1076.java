import java.util.Scanner;

/* CodeUP 1076 : [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력
 *  입력 : 영문자 1개 입력(a~z)
 *  출력 : a부터 입력한 문자까지 순서대로 공백을 두고 출력
 *  입력예시)  f -> 출력예시) a b c d e f
 * */
public class repeat_1076 {
    public static void main(String[] args) {
        System.out.print("문자입력 : ");
        Scanner sc = new Scanner(System.in);
        char i = sc.nextLine().charAt(0); //입력된 문자
        char a = 'a'; // 비교를 위한 문자
        do{
            System.out.println(a + " ");
            a++;
        }while (a<=i); //a와 입력된 문자 비교하여 같아질때까지 반복
    }
}

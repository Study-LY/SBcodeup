import java.util.Scanner;

/* CodeUP 1053 : [기초-논리연산] 참 거짓 바꾸기
 *  입력 : 정수 1개 입력(단, 0 또는 1만 입력)
 *  출력 : 입력된 값이 0이면 1, 1이면 0을 출력
 *  입력예시) 1 -> 출력예시) 0
 * */
public class logical_1053 {
    public static void main(String[] args) {
        System.out.print("0 또는 1을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 0  || num==1){
            if(num==1){
                System.out.println(0);
            }else System.out.println(1);
        }else System.out.println("0 또는 1을 입력하세요.");
    }
}

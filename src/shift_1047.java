import java.util.Scanner;

/* CodeUP 1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력
 *  입력 : 정수 1개 입력 (단, -1073741824 ~ +1073741823 범위)
 *  출력 : 2배 곱한 정수 출력
 *  입력예시) 1024 -> 출력예시) 2048
 *  주의) 정수를 2배로 곱하거나 나누어 계산해 주는 비트단위시프트연산자 <<, >>를 이용한다.
 * */
public class shift_1047 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= -107374182 && num <= 107374182){
            System.out.println("2배 곱한 정수 : "+(num<<1));
        }else System.out.println("다시 입력하시오.");

    }

}

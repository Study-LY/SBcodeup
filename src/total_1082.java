import java.util.Scanner;

/* CodeUP 1082 : [기초-종합] 16진수 구구단?
 *  입력 : 16진수로 한 자리 수 입력(단, A~ F까지만 입력)
 *  출력 : 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄 바꿔 출력(결과도 16진수 출력)
 *  입력예시) B  -> 출력예시) B*1=B
 *                         B*2=16
 *                         B*3=21
 *                         B*4=2C
 *                         B*5=37
 *                         B*6=42
 *                         B*7=4D
 *                         B*8=58
 *                         B*9=63
 *                         B*A=6E
 *                         B*B=79
 *                         B*C=84
 *                         B*D=8F
 *                         B*E=9A
 *                         B*F=A5
 * */
public class total_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("16진수를 입력하시오. : ");
        int num = sc.nextInt(16); //입력된 수를 16진수로 받아 num에 저장
        for(int i = 1; i <16; i++){ //
            System.out.printf("%X * %X = %X\n",num,i,num*i); //16진수로 출력하기 위해 %X 형태로 출력
        }
    }
}

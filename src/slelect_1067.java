import java.util.Scanner;

/* CodeUP 1067 : [기초-조건/선택실행구조] 정수 1개 입력받아 분석
 *  입력 : 정수 1개 입력(단, 입력 범위는 -2147483648 ~ +2147483647 , 0은 입력되지 않는다.)
 *  출력 : 입력된 정수에 대해 첫줄에 minus 나 plus, 두번째줄에 odd 나 even을 출력
 *  입력예시) -2147483648 -> 출력예시) minus
 *                                  even
 * */
public class slelect_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");

        try {
            int num = sc.nextInt();
            if(num >= 0 && num <= 2147483647){
                if(num<0){
                    System.out.println("minus");
                }else System.out.println("plus");
                if(num%2==0){
                    System.out.println("even");
                }else System.out.println("odd");
            }else System.out.println("다시 입력하시오.");
        }catch(Exception e){
            System.out.println("다시 입력하시오.");
        }

    }
}

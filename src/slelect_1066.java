import java.util.Scanner;

/* CodeUP 1066 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀  출력
 *  입력 : 정수 3개 입력(단, 입력 범위는 0 ~ +2147483647)
 *  출력 : 입력된 순서대로 짝(even)/홀(odd) 바꿔 출력
 *  입력예시) 1 2 8 -> 출력예시) odd
 *                            even
 *                            even
 * */
public class slelect_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하시오. : ");
        try {
            int num1 = sc.nextInt();
            if(num1 >= 0 && num1 <= 2147483647){
                System.out.print("두번째 정수를 입력하시오. : ");
                int num2 = sc.nextInt();
                if(num2 >= 0 && num2 <= 2147483647){
                    System.out.print("세번째 정수를 입력하시오. : ");
                    int num3 = sc.nextInt();
                    if(num3 >= 0 && num3 <= 2147483647){

                        if(num1%2==0){
                            System.out.println("짝(even)");
                        }else System.out.println("홀(odd)");
                        if(num2%2==0){
                            System.out.println("짝(even)");
                        }else System.out.println("홀(odd)");
                        if(num3%2==0){
                            System.out.println("짝(even)");
                        }else System.out.println("홀(odd)");

                    }else System.out.println("다시 입력하시오.");
                }else System.out.println("다시 입력하시오.");
            }else System.out.println("다시 입력하시오.");
        }catch(Exception e){
            System.out.println("다시 입력하시오.");
        }

    }
}

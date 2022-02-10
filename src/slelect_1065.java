import java.util.Scanner;

/* CodeUP 1065 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝수만 출력
 *  입력 : 정수 3개 입력(단, 입력 범위는 0 ~ +2147483647)
 *  출력 : 짝수만 순서대로 줄을 바꿔 출력
 *  입력예시) 1 2 4 -> 출력예시) 2
 *                            4
 * */
public class slelect_1065 {
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
                            System.out.println(num1);
                        }
                        if(num2%2==0){
                            System.out.println(num2);
                        }
                        if(num3%2==0){
                            System.out.println(num3);
                        }
                    }else System.out.println("다시 입력하시오.");
                }else System.out.println("다시 입력하시오.");
            }else System.out.println("다시 입력하시오.");
        }catch(Exception e){
            System.out.println("다시 입력하시오.");
        }

    }
}

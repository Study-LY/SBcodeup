import java.util.Scanner;

/* CodeUP 1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력
 *  입력 : 정수 1개 입력(단, 입력 범위는 0 ~ 100)
 *  출력 : 입력된 정수에 대해 90~ 100 : A / 70~ 89 : B / 40~ 69 : C / 0~ 39 : D 출력
 *  입력예시) 73 -> 출력예시) B
 * */
public class slelect_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오. : ");
        try {
            int num = sc.nextInt();
            if(num >= 0 && num <= 100){
                if(num>=90 && num<=100){
                    System.out.println("A");
                }else if(num>=70 && num<=89){
                    System.out.println("B");
                }else if(num>=40 && num <= 69){
                    System.out.println("C");
                }else System.out.println("D");

            }else System.out.println("다시 입력하시오.");
        }catch(Exception e){
            System.out.println("다시 입력하시오.");
        }

    }
}

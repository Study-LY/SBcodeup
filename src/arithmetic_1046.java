import java.util.Scanner;

/* CodeUP 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력
 *  입력 : 정수 3개 입력 (단, -2147483648 ~ +2147483647 범위)
 *  출력 : 합과 평균을 줄을 바꿔 출력, 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력
 *  입력예시) 1 2 3 -> 출력예시) 6
 *                            2.0
 * */
public class arithmetic_1046 {
    public static void main(String[] args) {
        System.out.print("첫번째 정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a >= -2147483647 && a <= 2147483647) { // 첫번째 입력값이 조건에 해당할 경우
                System.out.print("두번째 정수를 입력하시오 : ");
                int b = sc.nextInt();
                if(b>=-2147483647 && b<=2147483647) { //두번째 입력값이 조건에 해당할 경우
                    System.out.print("두번째 정수를 입력하시오 : ");
                    int c = sc.nextInt();
                    if (c >= -2147483647 && c <= 2147483647) { //두번째 입력값이 조건에 해당할 경우
                        int sum = a + b + c;
                        System.out.println("합 : " +sum);
                        double avg = (double) (a + b + c) / 3; //소수점때문에 캐스팅함
                        System.out.println("평균 : "+String.format("%.2f",avg)); //String.format을 이용하여 문자열 형식 지정
                    } else System.out.println("범위 안의 정수로 다시 입력하세요.");
                }else System.out.println("범위 안의 정수로 다시 입력하세요.");
            }else System.out.println("범위 안의 정수로 다시 입력하세요.");
        }catch (Exception e){
            System.out.println("범위 안의 정수로 다시 입력하세요."); //첫번째 입력값이 int 범위를 벗어났을때
        }
    }
}

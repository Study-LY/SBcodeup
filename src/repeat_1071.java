import java.util.Scanner;

/* CodeUP 1071 : [기초-반복실행구조] 0 입력될때까지 무한 출력
 *  입력 : 정수 입력(단, 입력 범위는 -2147483648 ~ +2147483647 / 갯수는 알 수 없다.)
 *  출력 : 입력된 정수를 줄을 바꿔 출력하는데 0이 입력되면 종료
 *  입력예시) 7 4 2 3 0 1 5 6 9 10 8 -> 출력예시) 7
 *                                            4
 *                                            2
 *                                            3
 * */
public class repeat_1071 {
    public static void main(String[] args) {
        System.out.print("정수입력 : ");
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                int num = sc.nextInt();
                if (num>=-2147483648 && num <=2147483647){
                    if(num==0){
                        break;
                    }
                    System.out.println(num);
                }
            }catch (Exception e){
                System.out.println("다시 입력하시오."); break;
            }
        }
    }
}

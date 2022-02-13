import java.util.Scanner;

/* CodeUP 1079 : [기초-종합] 원하는 문자가 입력될 때까지 반복 출력
 *  입력 : 문자들이 1개씩 계속 입력
 *  출력 : 'q'가 입력될 때까지 입력된 문자를 줄 바꿔 한 줄씩 출력
 *  입력예시) x b k d l q g a c   -> 출력예시) x
 *                                          b
 *                                          k
 *                                          d
 *                                          l
 *                                          q
  * */
public class total_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하시오. : ");

        String[] c = sc.nextLine().split(" "); //구분자(공백)을 이용하여 배열 c에 저장
        for(int i=0; i<=c.length; i++){ //배열의 크기 만큼 인덱스를 증가시켜가면서
            System.out.println(c[i]); // 배열에 저장된 값 출력

            if(c[i].equals("q")){ // 배열에 저장된 값이 q일 경우에
                break; //멈춤
            }
        }
    }
}

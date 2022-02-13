import java.util.Scanner;

/* CodeUP 1084 : [기초-종합] 빛 섞어 색 만들기
 *  입력 : 빨녹파(r,g,b) 각 빛의 강약에 따른 가짓수(0~ 128) 입력
 *  예) 3 3 3은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지 색이 있음을 의미
 *  출력 : 만들 수 있는 rgb색의 정보를 오름차순으로 줄을 바꿔 모두 출력하고, 마지막에 그 갯수 출력
 *  입력예시) 2 2 2  -> 출력예시) 0 0 0
 *                             0 0 1
 *                             0 1 0
 *                             0 1 1
 *                             1 0 0
 *                             1 0 1
 *                             1 1 0
 *                             1 1 1
 *                             8
 * */
public class total_1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오. : ");
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <r; i++){
            for(int j =0; j<g; j++){
                for (int x=0; x<b; x++){
                    System.out.println(i+" "+j+" "+x);
                    cnt++; //갯수확인을 위한 변수
                }
            }
        }System.out.println(cnt);
    }
}

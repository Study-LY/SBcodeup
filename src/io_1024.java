import java.util.Scanner;

/* CodeUP 1024 : [기초-입출력] 단어1개 입력받아 나누어 출력
 *  입력 : 단어(영어) 하나 입력 (단, 단어의 길이는 20자 이하)
 *  출력 : 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩 ''로 묶어서 출력
 *  입력예시) Boy -> 출력예시) 'B'
 *                          'o'
 *                          'y'
 * */
public class io_1024 {
    public static void main(String[] args) {
        System.out.print("단어(영어)를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for(int i=0; i<word.length(); i++){ //배열의 index와 같은 느낌으로 word로 받은 단어의 길이 파악
            System.out.println("\'"+word.charAt(i)+"\'"); //charAt은 String으로 받은 문자열에서 한 글자만 char타입으로 변환
        }
    }
}

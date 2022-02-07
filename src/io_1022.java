import java.io.*;

/* CodeUP 1022 : [기초-입출력] 문장1개 입력받아 그대로 출력
 *  입력 : 공백이 포함되어 있는 한 문장 입력
 *  단, 입력되는 문장은 여러 개의 단어로 구성, 엔터로 끝
 *  최대 길이는 2000문자를 넘지 않음
 *  출력 : 입력 그대로 출력
 *  입력예시) Programming is very fun!! -> 출력예시) Programming is very fun!!
 * */
public class io_1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(word);
        bw.flush();;
    }
}

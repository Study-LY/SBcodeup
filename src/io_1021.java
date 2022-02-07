/* CodeUP 1021 : [기초-입출력] 단어1개 입력받아 그대로 출력
 *  입력 : 50자 이하의 단어 입력
 *  문자를 50개 저장하기 위해서는 char data[51] 로 선언
 *  char data[51]="";
 *  scanf("%s", data); 를 실행하면 data[51]에 한 단어 저장됨
 *  출력 : 입력 그대로 출력
 *  입력예시) Informatics -> 출력예시) Informatics
 * */
//public class io_1021 {
//    public static void main(String[] args) {
//        System.out.print("단어를 입력하시오 (구분자는 띄어쓰기) : ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine(); //사용자가 입력한 값을 변수 i에 저장
//        String[] data = s.split(" "); //변수 i 에 저장된 값을 구분자를 기분으로 쪼개어 배열 y에 대입
//
//        for(int i=0; i<data.length; i++){ //배열의 크기보다 작을때 반복
//            System.out.print(data[i]); //배열에 저장된 값 출력
//        }
//
//    }
//}

/* CodeUP 1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력
 *  입력 : 주민번호 앞 6자리와 뒷 6자리가 - 로 구분되어 입력
 *  출력 : -를 제외한 주민번호 13자리를 모두 붙여서 출력
 *  입력예시) 000907-1121112 -> 출력예시) 000907-1121112
 * */
//public class io_1020 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String i = sc.nextLine(); //입력값 i 변수에 대입
//        String[] y; //split로 쪼갠 데이터를 넣기위해 배열로 선언
//        y = i.split("-");//구분자 - 인 값을 y배열에 대입
////방법 1
//        String a = y[0]; //구분자 -를 기분으로 앞에 값 배열y[0]에 저장된 값을 a 변수에 저장
//        String b = y[1]; //구분자 -를 기분으로 뒤에 값 배열y[1]에 저장된 값을 b 변수에 저장
//        System.out.println(a+b); //문자 a와 b를 이어서 출력
////방법 2
//        for(String z : y){ //a에 값을 하나씩 저장
//            System.out.print(z); // 저장된 값 출력
//        }
//    }
//}

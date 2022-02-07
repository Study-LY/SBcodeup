/* CodeUP 1019 : [기초-입출력] 연월일 입력받아 그대로 출력
 *  입력 : 연,월,일 ".(닷)"으로 구분되어 입력
 *  출력 : yyyy.mm.dd 형식으로 출력
 *  입력예시) 2022.8.5 -> 출력예시) 2022.08.05
 * */
//public class io_1019 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // 입력받기 위함
//        System.out.print("연.월.일을 입력하세요 : ");
//        String ymd = sc.nextLine(); // 한줄로 입력 받아 ymd에 대입
//        String[] arr = ymd.split("\\."); //ymd에 대입한 문자열을 .으로 나누기
//
////        int a = Integer.parseInt(arr[0]); //분할된 값을 하나하나 int형 변수에 대입
////        int b = Integer.parseInt(arr[1]);
////        int c = Integer.parseInt(arr[2]);
//
//        int[] arr2 = new int[arr.length]; //arr배열의 길이 만큼의 배열 생성
//        for(int i=0; i<arr.length; i++){ //0번 인덱스부터 arr배열의 인덱스 보다 적을때까지
//            arr2[i] = Integer.parseInt(arr[i]); //String으로 받은 arr변수를 강제 형변환 하여 arr2배열에 대입
//        }
////        System.out.printf("%04d.%02d.%02d", a,b,c);
//        System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]);
//        //%숫자d를 이용하여 출력하면 입력한 숫자만큼 출력하는데 그 수가 지정된 수보다 적은자리의 수일 경우 앞에 0을 붙이기 위함
//    }
//    }


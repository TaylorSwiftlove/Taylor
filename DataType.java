public class DataType {
    
    public static void main(String[] args){
        // double형으로 평균 구하기
        double a = 10.3;
        double b = 9.6;
        double c = 10.1;

        System.out.println((a + b + c)/3);
        //아스키코드 기반 char로 a~z 출력
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");  //println : 끝에\n포함 print : \n 없음
        }

        //10진수 -> 8진수 or 16진수
        int d = 200;

        System.out.println("\n10진수 : " + d);
        System.out.format("8진수 : %o\n", d);   // 형식지정자 %o : 10진수 -> 8진수 변환
        System.out.format("16진수 : %x\n", d);   //%x : 10진수 -> 16진수

        //String자료형 내부함수 substring 활용
        String name = "minji";
        System.out.println(name);
        System.out.println(name.substring(0, 1));   //(0, 1) : 0은 첫번째 문자, 1 : 2번째 전까지
        System.out.println(name.substring(2, 5));   //3번째 부터 5번째 까지
    }
}

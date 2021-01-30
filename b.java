// 5개의 양수를 입력받아 배열에 넣고 그 중 큰수 찾기
import java.util.Scanner;   // Scanner 클래스

public class b{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   //Scanner 객체 생성
        
        int a[] = new int[5];   //배열생성
        int m = 0;  //가장 큰수
        System.out.println("양수 5개 입력 : "); //입력받기
        for(int i=0; i<5; i++){ 
            a[i]=scanner.nextInt(); //입력값 중 실수 읽기
            if(a[i]>m)
                m = a[i];
        }
        System.out.println("가장 큰 수는 " + m + "입니다.");

        // next 함수 사용
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");

        String name = scanner.next();   //문자열 읽기
        System.out.print(name);
        
        String city = scanner.nextLine();   // republic of 같이 공백있는거 입력, 여기까지만 이거 입력 후 나오고
        // \n 을 포함하는 한 라인을 읽고 \n 을 버린 나머지 문자열 리턴
        System.out.print(city);

        int age = scanner.nextInt();    // 나머지들은 마지막에
        System.out.print(age);

        double weight = scanner.nextDouble();
        System.out.print(weight);

        boolean inSingle = scanner.nextBoolean();
        System.out.print(inSingle);

        System.out.print("뭐라해보소 : ");
        boolean has = scanner.hasNext();    // 현재 입력된 토큰이 있다면 true 아니면 입력 때까지 무한정 대기, 새로운 입력이 들어올때 true 리턴, 컨트롤 z 입력시 끝
        System.out.print(has);

        scanner.close();    //Scanner 닫기, 없으면 오류, System.in도 못씀
    }
}
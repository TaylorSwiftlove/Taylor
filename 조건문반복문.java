public class 조건문반복문{
    final static int N = 15;
    public static void main(String[] args){
        //if문 이용하여 특정 문자열을 포함 확인
        String a = "I LOVE YOU";
        if(a.contains("LOVE")){ //String내부함수 contains : 특정문자열 포함 확인, 대소문자 구분
            //포함하는 경우 실행되는 부분
            System.out.println("Me Too.");
        }
        else{
            //포함하는 않는 경우 실행되는 부분
            System.out.println("I HATE YOU");
        }

        /*int i = 1, sum = 0;
        while(i <= 1000)
        {
            sum += i++;
        }
        System.out.println(sum);*/
    
    for(int i = -N; i <= N; i++){
        for(int j = -N; j <= N; j++){
            if(i*i + j*j <= N*N)
                System.out.print("*");
            else 
                System.out.print(" ");

        }
        System.out.println();
        }
    }   
}
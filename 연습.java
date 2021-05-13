public class 연습{
    public static void main(String args[]){
        People p = new People();
        p.peopleinfo();
        Parent pa = new Parent();
        Child c = new Child();
        Order o = new Order();
        o.OrderInfo();

        Parent c1 = new Parent("MINji");
        
        int i;
        for (i = 0; i <= 10; i++){
            i++;    //이 문장이 끝나는 순간 +1
            System.out.print(i);
        }
        System.out.println(i);

        for(i = 0; i <= 10; i++){
            ++i;    //동시에 +1
            System.out.print(i);
        }
        System.out.println(i);

        for(i = 1; i <= 10; i++){
            for(int k = 10; k >= i; k--){
                System.out.print(" ");
            } 
            for(int j = 0; j < 2*i-1; j++){
                    System.out.print("*");
                }
            System.out.println("\n");
        }
    }
}  
class People{
        int age = 30;
        String name = "James";
        boolean marriage = true;
        int child = 3;

        public void peopleinfo(){
            System.out.println("나이 : " + age);
            System.out.println("이름 : " + name);
            System.out.println("결혼여부 : " + marriage);
            System.out.println("자녀수 : " + child);
        }

    }

class Order{
    String number = "2019072110001";
    String id = "abc123";
    String date = "2019년 7월 21일";
    String name = "홍길순";
    String product = "PD-345-12";
    String address = "서울시 영등포구 여의도동 20번지";

    public void OrderInfo(){
        System.out.println("주문 번호 :" + number);
        System.out.println("주문자 아이디 :" + id);
        System.out.println("주문 날짜 :" + date);
        System.out.println("주문자 이름 :" + name);
        System.out.println("주문 상품 번호 :" + product);
        System.out.println("배송 주소 :" + address);
    }
}

class Parent{
    int age = 45;
    String n;
    public Parent(){  //생성자
        System.out.println("부모 생성자");
    }
    
    public Parent(String name){
        System.out.println("내 자녀의 이름 :" + name);
    }
}

class Child extends Parent{
    int age = 22;
    public Child(){
        System.out.println("child age is :" + this.age);
    }
    public Child(String name){
        System.out.println("이름은 "+ name);
    }
}
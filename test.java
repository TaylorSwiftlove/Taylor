public class test {
    public static void main(String args[]){
        calculator c = new calculator(2);//calculator생성자
        System.out.println(c.i);    
        plus p = new plus(3);//plus생성자
        System.out.println(p.i);    
    }
}
class calculator{
    int i;
    public calculator(int i){
        this.i = i;
    }
    public calculator(){} //상위클래스 중 매개변수 있는 생성자 있을 경우 
    //매개변수 없는 건 자동생성 안해주기 때문에 직접 적어줘야함.
    
}
class plus extends calculator{
    int i;
    public plus(int i){
        this.i = i;
    }
}

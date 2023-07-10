public class T {
    public T(){
        System.out.println("T");
    }
    public T(String s){
        System.out.println(s);
    }
}
class X extends T{
    public X(String s){
//        super();
//        super(s);
        System.out.println("D");
    }

}
class Test {
    public static void main(String[] args) {
        T t= new X("H");
    }
}
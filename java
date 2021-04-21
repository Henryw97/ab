class A{
    static {
        System.out.print("a");
    }
    public A(){
        System.out.print("b");
    }
}
class B extends A{
    static{
            System.out.print("c");
}
    public B(){
        System.out.print("d");
    }
}
public class ab {
    public static void main(String[] args){
        A b = new B();
                b = new B();
    }
}

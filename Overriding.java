class A{
    int x, y;
    A(int a, int b){
        x = a;
        y = b;
    }

    void show(){
        System.out.println("x: " + x + " y: " + y);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(){
        super();
        System.out.println("k : " + k);
    }
}

class Overriding{
    public static void main(String[] args){
        B b = new B(2, 5, 11);
        b.show();
    }
}
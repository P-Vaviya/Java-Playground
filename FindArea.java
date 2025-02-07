class Figure{
    double dim1, dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        return 0.0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        return ((dim1*dim2));
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    double area(){
        return ( ((dim1*dim2)/2));
    }
}

class FindArea{
    public static void main(String[] args){
        Figure f = new Figure(10, 2);
        Rectangle r = new Rectangle(20, 30);
        Triangle t = new Triangle(10, 8);

        Figure ref;

        ref = t;
        System.out.println(ref.area());

        ref = r;
        System.out.println(ref.area());

        ref = f;
        System.out.println(ref.area());
    }
}
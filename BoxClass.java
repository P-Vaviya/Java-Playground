class Box{
    double length, width, height;

    double surface_area(){
        return 2*(length * width) + 2*(length * height) + 2*(height * width);
    }

    double volume(){
        return (length * width * height);
    }
}

class BoxClass{
    public static void main(String[] args){
        Box b1 = new Box();
        Box b2 = new Box();

        b1.length = 10;
        b1.width = 11;
        b1.height = 9;
        System.out.println("The Surface area is : " + b1.surface_area() );
        System.out.println("The volume is : " + b1.volume() );

        b2.volume();
        b2.surface_area();
        System.out.println("The Surface area is : " + b2.surface_area() );
        System.out.println("The volume is : " + b2.volume() );
    }
}
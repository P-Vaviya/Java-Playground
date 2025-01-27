class Box{
    double length, width, height;

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(){
        length = 0.1;
        width = 0.1;
        height = 0.1;
    }

    double getLength(){
        return length;
    }

    void setLength(){
        length = 30;
    }

    double surface_area(){
        return 2*(length * width) + 2*(length * height) + 2*(height * width);
    }

    double volume(){
        return (length * width * height);
    }
}

class SetGetConstructor{
    public static void main(String[] args){
        Box b1 = new Box(10, 11, 9);
        Box b2 = new Box();
        b1.setLength();

        System.out.println("The length of the box is : " + b1.getLength());
        System.out.println("The Surface area is : " + b1.surface_area());
        System.out.println("The volume is : " + b1.volume());
        

        b2.setLength();
        System.out.println("The length of the box is : " + b2.getLength());
        System.out.println("The Surface area is : " + b2.surface_area());
        System.out.println("The volume is : " + b2.volume());
    }
}
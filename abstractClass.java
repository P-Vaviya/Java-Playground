abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class BOB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class abstractClass{
    public static void main(String[] args){
        Bank b;
        b = new SBI();
        System.out.println("The rate of interest of SBI bank is " + b.getRateOfInterest());
        b = new BOB();
        System.out.println("The rate of interest of BOB bank is " + b.getRateOfInterest());
    }
}
interface Bank{
    int getRateOfInterest();
}

class SBI implements Bank{
    public int getRateOfInterest(){
        return 7;
    }
}

class BOB implements Bank{
    public int getRateOfInterest(){
        return 8;
    }
}

class Interface{
    public static void main(String[] args){
        Bank b = new SBI();
        System.out.println("The rate of interest of SBI bank is " + b.getRateOfInterest());
        b = new BOB();
        System.out.println("The rate of interest of BOB bank is " + b.getRateOfInterest());
    }
}
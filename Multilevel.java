class Animal{
    void eat(){
        System.out.println("eating...");
    }

    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
    Dog(){
        System.out.println("Dog Constructor");
    }
}

class babyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
    babyDog(){
        System.out.println("babyDog Constructor");
    }
}

class Multilevel{
    public static void main(String[] args){
        babyDog d = new babyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
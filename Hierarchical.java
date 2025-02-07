class Animal{
    String name;
    public void eat(){
        System.out.println("eating...");
    }

    Animal(){}
    Animal(String n){name = n;}
}

class Dog extends Animal{
    public void bark(){
        System.out.println("barking...");
    }

    Dog(){}
    Dog(String n){
        super(n);
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Meowing...");
    }
}

class Hierarchical{
    public static void main(String[] args){
        Animal d = new Animal();
        Cat c = new Cat();

        d.eat();
        c.meow();
    }
}
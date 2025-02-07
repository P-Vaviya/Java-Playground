class Animal{
    String name;
    public void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("barking...");
    }
}

class Reference{
    public static void main(String[] args){
        Animal a = new Dog();
        a.name = "Rocky Bhai";
        a.eat();
    }
}
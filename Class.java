import java.lang.Object;

class Class{
    int id = 005, roll = 4005;
    String name = "Eagle";
    public String toString(){
        return ("id : "+id+" name : "+name+" roll : "+roll);
    }



    public static void main(String[] args){
        Class c = new Class();
        System.out.println(c);
    }

}

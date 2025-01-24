import java.util.Scanner;

class Student{
    int roll_no;
    double marks1, marks2;
    String name;

    double CalculateTotal(){
        return marks1 + marks2;
    }
    
    void PrintResult(){
        System.out.println("The roll no. of the student is : " + roll_no);
        System.out.println("The name of the student is : " + name);
        System.out.println(marks1 + marks2 + " is the marks of the student ");
    }
}

class StudentClass{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the name of the student : ");
        String name = myObj.next();

        System.out.print("Enter the roll no. of the student : ");
        int roll_no = myObj.nextInt();

        System.out.print("Enter the marks1 of the student : ");
        double marks1 = myObj.nextDouble();

        System.out.print("Enter the marks2 of the student : ");
        double marks2 = myObj.nextDouble();

        Student s1 = new Student(); 
        s1.name = name;
        s1.marks1 = marks1;
        s1.marks2 = marks2;
        s1.roll_no = roll_no;
        System.out.println("\nTotal marks achieved by : " + s1.name + " is " + s1.CalculateTotal());
        s1.PrintResult();
        System.out.println();
    }
}
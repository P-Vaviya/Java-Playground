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
        Student s1 = new Student(); 
        s1.name = "Mr.Eagle";
        s1.marks1 = 70;
        s1.marks2 = 71;
        s1.roll_no = 005;
        System.out.println("Total marks achieved by : " + s1.name + " is " + s1.CalculateTotal());
        s1.PrintResult();
        System.out.println();

        Student s2 = new Student(); 
        s2.name = "Unknown";
        s2.marks1 = 0;
        s2.marks2 = 1;
        s2.roll_no = 001;
        System.out.println("Total marks achieved : " + s2.name + " is " + s2.CalculateTotal());
        s2.PrintResult();
    }
}
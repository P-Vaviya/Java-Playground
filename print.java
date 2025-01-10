import java.util.Scanner;

class print{
    public static void main(String args[]){
        Scanner myObj = new Scanner (System.in);

        System.out.print("Enter the beginning number : ");
        int beg = myObj.nextInt();
        System.out.print("Enter the ending number : ");
        int end = myObj.nextInt();

        for(int i = beg; i<=end; i++){
            System.out.println(i);
        }
    }
}
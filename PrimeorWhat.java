import java.util.Scanner;

class PrimeorWhat{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = myObj.nextInt();

        for(int i = 2; i<num1; i++){
            if(num1 % i == 0){
                System.out.println("It is not a prime number ");
                break;
            }
            else{
                System.out.println("It is a prime number ");
                break;
            }
        }
    }
}
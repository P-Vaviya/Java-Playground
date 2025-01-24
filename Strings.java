import java.util.Arrays;

class Strings{
    public static void main(String args[]){
        String str1 = new String("Mr Eagle");
        System.out.println(str1);
        System.out.println(str1.indexOf("Eagle")); //returns index value
        System.out.println(str1.charAt(0));  //returns character
        System.out.println(str1.substring(3));  //returns string
        System.out.println(str1.toUpperCase());  //returns string
        System.out.println(str1.replace('E', 'e')); //returns string

        char[] ch = {'E', 'a', 'g', 'l', 'e'};
        System.out.println(Arrays.toString(ch));
        System.out.println(new String(ch));



    }
}
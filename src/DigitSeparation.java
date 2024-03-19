import java.util.Scanner;

public class DigitSeparation{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter an Integer with 5 digits: ");
        num = in.nextInt();

        String integer = String.valueOf(num);

        System.out.print(integer.substring(integer.length() - 5, integer.length() - 4));
        System.out.print(" ");
        System.out.print(integer.substring(integer.length() - 4, integer.length() - 3));
        System.out.print(" ");
        System.out.print(integer.substring(integer.length() - 3, integer.length() - 2));
        System.out.print(" ");
        System.out.print(integer.substring(integer.length() - 2, integer.length() - 1));
        System.out.print(" ");
        System.out.print(integer.substring(integer.length() - 1, integer.length()));
    }
}
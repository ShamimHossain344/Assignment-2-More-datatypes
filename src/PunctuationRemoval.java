import java.util.Scanner;

public class PunctuationRemoval{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num, first, second;
        int length;

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        num = in.next();

        length = num.length();
        first = num.substring(0, length - 4);
        second = num.substring(length - 3, length);

        System.out.println(first.concat(second));

    }
}
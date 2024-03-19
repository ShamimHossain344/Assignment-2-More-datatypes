import java.util.Scanner;

public class MilitaryTime{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t1, t2, diff;
        String h, min;
        System.out.print("First Time: ");
        t1 = in.nextInt();

        System.out.print("Second Time: ");
        t2 = in.nextInt();

        diff = t2 - t1;

        min = String.valueOf(diff);
        min = min.substring(min.length() - 2, min.length());

        h = String.valueOf(diff);
        h = h.substring(0, h.length() - 2);

        System.out.println(h + " hours " + min + " minutes");

    }
}
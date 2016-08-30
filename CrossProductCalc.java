/**
 * Created by sophia on 8/29/2016.
 */
//a very barebones cross product calculator.
import java.util.Scanner;

public class CrossProductCalc {
    public static void main(String[] args) {
        String r;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter ax:");
            int ax = scanner.nextInt();
            System.out.println("ay:");
            int ay = scanner.nextInt();
            System.out.println("az:");
            int az = scanner.nextInt();
            System.out.println();
            System.out.println("Enter bx:");
            int bx = scanner.nextInt();
            System.out.println("by:");
            int by = scanner.nextInt();
            System.out.println("bz:");
            int bz = scanner.nextInt();
            int cx = ay * bz - by * az;
            int cy = az * bx - ax * bz;
            int cz = ax * by - ay * bx;
            System.out.print("The cross product of a x b is: <" + cx + "," + cy + "," + cz + ">");
            System.out.println();
            System.out.println("Again?(any key to continue, n to quit)");
            r = scanner.next();
        }while(!r.equals("n"));




    }
}

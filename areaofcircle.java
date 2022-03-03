package Lesson2;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        int r;
        double pi=3.14,area,perimeter,a,area2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Value For r: ");
        r = input.nextInt();
        System.out.print("Please Enter a Value For a: ");
        a = input.nextDouble();

        area = pi * r * r;
        perimeter = 2 * pi * r;
        area2 = (pi * r * r * a)/360;

        System.out.print("---------------\n");
        System.out.println("Area of Circle : "+area);
        System.out.println("Perimeter of Circle : "+perimeter);
        System.out.println("Area of a° Angled Circle : "+area2);
    }
}

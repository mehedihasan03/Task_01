import java.util.Scanner;
public class AreaParimeter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a circle radius");

        double radius = sc.nextDouble();
        double parimeter = 2 * radius * 3.141592653589793;
        double area = radius * radius * 3.141592653589793;

        System.out.println("The parimeter of the circle is " + parimeter);
        System.out.println("The area of the circle is " + area);
        System.out.println(Math.PI);// value of PI(pie)


    }
    
}
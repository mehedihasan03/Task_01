import java.util.Scanner;
public class PrintHello{
    public static void main(String[] args) {
        String hel = "Hello";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();

        System.out.println(hel + " " + name);
    }    
}
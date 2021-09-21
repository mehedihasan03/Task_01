import java.util.Scanner;
public class ProductNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1 = input.nextInt();

        System.out.println("Enter second number ");
        int num2 = input.nextInt();

        int ans = num1 * num2;
        
        productNum(ans);
    }
    
    public static void productNum(int ans){
        System.out.println("Your product number is " + ans);
    }
}
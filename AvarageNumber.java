import java.util.Scanner;
public class AvarageNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        float num1 = sc.nextFloat();

        System.out.println("Enter second number");
        float num2 = sc.nextFloat();

        System.out.println("Enter third number");
        float num3 = sc.nextFloat();

        float avg = (num1 + num2 + num3) / 3;
        //System.out.println(avg);

        avarage(avg);

    }
    
    public static void avarage(float avg){
        System.out.println("The avarage is " + avg);
    }
    
}
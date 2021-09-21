import java.util.Scanner;
public class ArrithmaticOperation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //*******************a******************** */
    int a = -5;
    int b = 8;
    int c = 6;
        int equation_a = a + b * c;
        System.out.println(equation_a);

    //********************b******************** */
    int d = 55;
    int e = 9;
    int f = 9;
    int equation_b = (d + e) % f;
    System.out.println(equation_b);

    //********************b******************** */

    int m = 20;
    int n = -3;
    int o = 5;
    int p = 8;

    int equation_c = m + n * o / p;
    System.out.println(equation_c);

    //********************b******************** */

    int q = 5;
    int r = 15;
    int s = 3;
    int t = 2;
    int u = 8;
    int v = 3;

    int equation_d = q + r / s * t - u % v;
    System.out.println(equation_d);

    }    
}
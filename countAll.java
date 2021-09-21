import java.util.Scanner;

public class countAll{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something");
        String name = sc.nextLine();//"1263377 Mehedi Hasan";
        int a = name.length();

        nameLength(a);
    }
    public static void nameLength(int a) {
        System.out.println(a);
    }
}
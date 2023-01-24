import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num >= 0)
            System.out.println("You enter a positive number");
        else
            System.out.println("The number is negative and skipped");


    }
}

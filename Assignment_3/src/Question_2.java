import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num < 0)
            System.out.println("The absolute value: "+ -1 * num);


    }
}

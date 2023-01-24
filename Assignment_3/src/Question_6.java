import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mark = sc.nextInt();
        if (mark >= 90 )
            System.out.println("Your grade is: A+");
        else if (mark >= 80)
            System.out.println("Your grade is: A");
        else if (mark >= 70)
            System.out.println("Your grade is: B+");
        else if (mark >= 60)
            System.out.println("Your grade is: B");
        else if (mark >= 50)
            System.out.println("Your grade is: C");
        else if (mark >= 40)
            System.out.println("Your grade is: D");
        else if (mark >=30)
            System.out.println("Your grade is: E");
        else if (mark < 30)
            System.out.println("Your grade is: F");
        else
            System.out.println("Enter valid marks");
    }
}

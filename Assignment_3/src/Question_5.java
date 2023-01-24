import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        char op;
        double num1;
        double num2;
        double ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Operator(+, -, *, /): ");
        op = sc.next().charAt(0);
        switch (op)
        {
            case '+':
                System.out.println("Enter two numbers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;
            case '-':
                System.out.println("Enter two numbers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
                break;
            case '*':
                System.out.println("Enter two numbers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
                break;
            case '/':
                System.out.println("Enter two numbers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);
                break;
            default:
                System.out.println("Error! The operator is not correct");
                break;
        }


    }
}

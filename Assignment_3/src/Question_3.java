import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();
        if (sp > cp)
            System.out.println("Profit: "+ (sp - cp));
        else
            System.out.println("Loss: "+ (cp - sp));


    }
}

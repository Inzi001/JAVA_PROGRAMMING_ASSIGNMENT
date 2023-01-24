import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter mark of 1st subject");
        int mark1 = scn.nextInt();
        System.out.println("Enter mark of 2nd subject");
        int mark2 = scn.nextInt();
        System.out.println("Enter mark of 3rd subject");
        int mark3 = scn.nextInt();
        int total_marks = mark1 + mark2 + mark3;
        System.out.println("Total Marks: "+total_marks);
        int percentage = total_marks/3;
        System.out.println("Percentage Marks: "+percentage+"%");
    }
}

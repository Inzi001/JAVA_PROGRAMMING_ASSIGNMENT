public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 2;
        int y = 4;
        System.out.println(x*y);

       //Question 2
        int z = 'U';
        System.out.println("The ASCII value of U is :" +z);

        //Question 3
        int length = 4;
        int breadth = 5;
        System.out.println("The length is : "+length);
        System.out.println("The breadth is : "+breadth);
        System.out.println("The Area of Rectangle is : "+length*breadth);

        //Question 4
        int num = 2;
        int cube = num*num*num;
        System.out.println("The cube is: "+cube);

        //Question 5
        int a = 5;
        int b = 6;
        System.out.println("The first number before swap is : "+a);
        System.out.println("The second number before swap is :"+b);
        int temp; //variable for swap two number
        temp = a;
        a = b;
        b = temp;
        System.out.println("The first number after swap is : "+a);
        System.out.println("The second number after swap is :"+b);
    }
}
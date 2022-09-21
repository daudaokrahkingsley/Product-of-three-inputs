
import java.util.*;

class productOfthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration of variable x, y, z;
        int x;
        int y;
        int z;

        // prompting user to enter First(X) Number
        System.out.printf("Enter value for x : ");
        x = input.nextInt();

        // prompting user to enter Second(Y) Number
        System.out.printf("Enter value for y: ");
        y = input.nextInt();

        // prompting user to enter Third(Z) Number
        System.out.printf("Enter value for z : ");
        z = input.nextInt();

        // finding the Product of x,y,z and to store it in variable Result..
        int result = x * y * z;
        System.out.printf("Product is " + result);

    }
}
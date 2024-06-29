import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public void method() {
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number is Negative!");
        } else if (0 < num) {
            System.out.println("Number is Positive!");
        } else {
            System.out.println("Number is equal to zero!");
        }


    }

}

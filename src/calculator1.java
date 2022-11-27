
import java.util.Scanner;

 public class calculator1 {
    public static void main(String[] args) {

        char selection;
        int num1, num2, num3, result;


        Scanner input = new Scanner(System.in);


        System.out.println("Choose a selection: ");
        selection = input.next().charAt(0);


        System.out.println("Enter first number");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter third number");
        num3 = input.nextInt();

        switch (selection) {
            case '1':
                result = num1 - num2 + num3;
                System.out.println(num1 + " - " + num2 + " + " + num3 + " = " + result);
                break;

            case '2':
                result = num1 - num2 + num3;
                System.out.println(num1 + "+" + num2 + "-" + num3 + " = " + result);
                break;

            case '3':
                result = num1 - num2 * num3;
                System.out.println(num1 + "-" + num2 + "*" + num3 + " = " + result);

                System.out.println("Invalid selection!");
                break;
        }

        }

    }
package task4;

import java.util.Scanner;

// Napisati program koji unosi i sabira brojeve sve dok se ne unese negativan broj.
// Tada ispisuje njihov zbir (zbir pozitivnih brojeva). (while petlja)
public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        while (number > 0){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number < 0){
                break;
            }
            sum += number;
        }
        System.out.println("The sum is " + sum + ".");

    }
}

package task2;

import java.util.Scanner;

//Calculate the sum of odd numbers from 0 to N.
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n as the upper value: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 != 0) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println("The sum of odds number from 1 do n is: " + sum);
    }
}

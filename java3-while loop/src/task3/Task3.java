package task3;

import java.util.Scanner;

//Calculate the sum of numbers from 0 to N.
public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n as the upper value: ");
        int n = input.nextInt();

        int i = 0;
        int sum = 0;

        while (i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of odds number from 1 do n is: " + sum);
    }
}

package task1;
//Add the first 20 positive numbers and display the result in the console. (While loop)
public class Task1 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while (i <= 20) {
            sum = sum + i;
            i++;
        }

        System.out.println("The sum of the numbers from 0 to 20 is: " +  sum);

    }
}

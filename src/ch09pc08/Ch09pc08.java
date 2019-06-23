package ch09pc08;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Frank
 * date 11/21/2017
 * purpose: to display and calculate the sum of integers in a string delineated by a comma
 */
public class Ch09pc08 {

    public static void main(String[] args) {
        //variables
        String numbers;
        double sum;
        
        //create keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Request input from user
        System.out.println("Please enter a string of numbers delineated by a comma: ");
        numbers = keyboard.nextLine();
        
        //Calculate and display sum
        sum = getSum(numbers);
        
        System.out.printf("The sum of the numbers is: %,f.\n", sum);
        
    }
    
    /**
     * Returns the sum of numbers in a string
     * 
     * @param str   the string to parse
     * @return      the summation of the numbers within the string
     */
    public static double getSum(String str)
    {
        //variables
        double sum = 0.0;
        String temp;
        
        //instantiate StringTokenizer class
        StringTokenizer token = new StringTokenizer(str, ",", false);
        
        while (token.hasMoreTokens())
        {
            sum += Double.parseDouble(token.nextToken().trim());
            
        }
        
        return sum;
    }
}

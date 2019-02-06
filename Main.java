
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        game();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void game()
    {
         boolean answer = false;
         int count = 0;
         int randomNumber = (int)(Math.random()*100 + 1);
         int dummy = -1;
         while(!answer) {
             Scanner in = new Scanner(System.in);
             System.out.println("\nEnter a number between 0 and 100, if you dare");
             int guess = in.nextInt();
             if(guess != dummy){
                 count++;
                }
             dummy = guess; 
             if(guess < 0 || guess > 100) {
                 System.out.print("Please enter a number between 0 and 100 ");
                }
             else if(guess < randomNumber) {
                 System.out.print("Your guess is to low ");
                }
             else if(guess == randomNumber) {
                 System.out.print("Winner ");
                 answer = true;
                }
             else if (guess > randomNumber) {
                 System.out.print("Your guess is too high");
                }
             
            }
         System.out.print("congrats you guessed " + randomNumber + " in " + count + " guesses");            
        }        
}

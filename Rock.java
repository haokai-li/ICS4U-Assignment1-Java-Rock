/*
* The "Rock, Paper, Scissor" program,
* just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-12-02
*
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "Rock, Paper, Scissor" program.
*/
final class Rock {

    /**
    * Rock variable.
    */
    public static final String ROCK = "Rock";

    /**
    * Paper variable.
    */
    public static final String PAPER = "Paper";

    /**
    * Scissor variable.
    */
    public static final String SCISSOR = "Scissor";

    /**
    * One variable.
    */
    public static final int ONE = 1;

    /**
    * Two variable.
    */
    public static final int TWO = 2;

    /**
    * Three variable.
    */
    public static final int THREE = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Rock() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate function.
    *
    * @param originalChoose
    *
    * @return process
    */

    static int[] process(final String originalChoose) {
        int[] answerArray = new int[2];
        Random rand = new Random();
        final int computerChoose = rand.nextInt(3) + 1;
        final answerArray[0] = computerChoose;
        if ((computerChoose == TWO && SCISSOR.equals(originalChoose))
            || (computerChoose == THREE && ROCK.equals(originalChoose))
            || (computerChoose == ONE && PAPER.equals(originalChoose))) {
            answerArray[1] = 1;
        } else if ((computerChoose == THREE && SCISSOR.equals(originalChoose))
            || (computerChoose == ONE && ROCK.equals(originalChoose))
            || (computerChoose == TWO && PAPER.equals(originalChoose))) {
            answerArray[1] = 2;
        } else if ((computerChoose == ONE && SCISSOR.equals(originalChoose))
            || (computerChoose == TWO && ROCK.equals(originalChoose))
            || (computerChoose == THREE && PAPER.equals(originalChoose))) {
            answerArray[1] = 3;
        } else {
            answerArray[1] = -1;
        }
        return answerArray;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            // input
            final Scanner input = new Scanner(System.in);
            System.out.print("Your choose(Rock, Paper, Scissor): ");
            final String originalChoose = input.nextLine();

            final int[] answer = process(originalChoose);

            if (answer[0] == ONE) {
                System.out.println("Chomputer choose: Rock.");
            } else if (answer[0] == TWO) {
                System.out.println("Chomputer choose: Paper.");
            } else if (answer[0] == THREE) {
                System.out.println("Chomputer choose: Scissor.");
            }

            if (answer[1] == ONE) {
                System.out.println("You win.");
            } else if (answer[1] == TWO) {
                System.out.println("It is a tie.");
            } else if (answer[1] == THREE) {
                System.out.println("You lose");
            } else if (answer[1] == -1){
                System.out.println("Your intput was error");
            }

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something was error.");
        }
        System.out.println("\nDone.");
    }
}

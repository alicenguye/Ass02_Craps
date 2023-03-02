import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration variable
        String continueGame ="";
        int die1;
        int die2;
        Scanner in = new Scanner(System.in); // create a Scanner object
        Random rnd = new Random(); // create a Random object called rnd.
        while (true) {
            while (true) {
                System.out.println("Let's roll the dice");
                die1 = rnd.nextInt(6) + 1;// generate a random int between 0-6
                die2 = rnd.nextInt(6) + 1;// generate a random int between 0-6
                int crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
                System.out.println("your total dice is " + crapsRoll);
                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) // the sum = 2,3 or 12
                {
                    System.out.println("crapping out you lose");
                    {
                        break;
                    }

                } else if (crapsRoll == 7 || crapsRoll == 11)// the sum = 7 or 11
                {
                    System.out.println(" natural, you win");
                    {
                        break;
                    }

                }
                if (crapsRoll == 1 || crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9 || crapsRoll == 10) {
                    System.out.println("that will be your point");// this will be their point
                    System.out.println("trying for point");
                    die1 = rnd.nextInt(6) + 1;// generate a random int between 0-6
                    die2 = rnd.nextInt(6) + 1;// generate a random int between 0-6
                    crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
                    System.out.println("your second total dice is: "+crapsRoll);
                    if (crapsRoll == 7)// if the second total equal 7 then they lose
                    {
                        System.out.println("you lose the game");
                    } else // if they get something different from 7 they win
                    {
                        System.out.println("you win");

                    }
                }
                {
                    break;
                }
            }

                System.out.println(" Play again? Y/N");// if they want to continue have to match with uppercase Y
                continueGame = in.nextLine();
                if (continueGame.equals("Y")) ;
                if(continueGame.equals("N")) {
                    break;
                }

            }
        }
    }













import java.util.Random;
import java.util.Scanner;

public class Number_Game
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();

        int minRange=1;
        int maxRange=100;
        
        int maxAttemps=7;
        int score=0;

        boolean playAgain=true;
        
        System.out.println("\t\t*******WELCOME TO NUMBER GAME*******");

        
        while(playAgain)
        {
            int GuessingNumber= random.nextInt(maxRange-minRange+1)+minRange;
            System.out.printf("Random number between %d and %d has been generated...",minRange,maxRange);

            boolean correctGuess= false;

            int attempt=0;
            while(attempt<maxAttemps && !correctGuess)
            {
                System.out.printf("\nAttempt %d:\n Enter your Guess:",attempt+1);
                int guess = scanner.nextInt();

            
                if ( guess == GuessingNumber )
                {
                    System.out.println("\t\tCongratulations!!!...You Guess correct Number");
                    correctGuess=true;
                    score++;                
                }
                else if(guess<GuessingNumber)
                {
                    System.out.println("\t\tToo Low. Try Again.");
                }
                else
                {
                    System.out.println("\t\tToo High. Try Again.");
                }

                attempt++;

            }


            if(!correctGuess)
            {
                System.out.println("\t\tOops!..You reached maximum attempts");
                System.out.printf("\nGuessing Number :%d\n",GuessingNumber);

            }

            System.out.println("Your Score:"+score);
            
            System.out.println("Do you want to play Again?(yes/no)");
            String playAgainInput=scanner.next();

            if(playAgainInput.equalsIgnoreCase("no"))
            {
                playAgain=false;
                System.out.println("\n\t\tThank you for playing!..");
            }
            


        }
         scanner.close();
    }
}
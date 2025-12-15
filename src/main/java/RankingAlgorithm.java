// logic used to rank options in RankingGame class
import java.util.ArrayList;
import java.util.Scanner;

public class RankingAlgorithm 
{
    private Scanner scanner;

    public RankingAlgorithm(Scanner scanner)
    {
        this.scanner = scanner;
    }

    private boolean gameInput(ArrayList<String> options, int[] wins) //input method
    {
        //how many options - need to rank
        int howMany = options.size();


        //compare EVERY pair of items - nested loop - like memory game
        
        for (int i = 0; i < howMany; i++)
            //int j = i + 1 = comparing to next item in list ( if i = 0 -> j starts at 1)
            // j < howMany = continue checking all items that come after i
            for (int j = i + 1; j < howMany; j++)
            {
                System.out.println("\nPlease type 'this', 'that', or 'quit'.");
                //get the 2 items ranking btwn
                String first = options.get(i);
                String second = options.get(j);

                //ask user which they prefer
                System.out.println("\n ★ᯓ This or That? ᯓ★");
                System.out.println("\nThis: " + first);
                System.out.println("That: " + second);

                while(true)
                {
                    System.out.println();
                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("this"))
                    {
                        wins[i]++;
                        break;
                    }
                    else if (choice.equalsIgnoreCase("that"))
                    {
                        wins[j]++;
                        break;
                    }
                    else if (choice.equalsIgnoreCase("quit"))
                    {
                        return false; //quits game in RankingGame file
                    }
                    else
                    {
                        System.out.println("Please type 'this', 'that', or 'quit'.");
                    }
                }

            }
        return true;

    }

    public ArrayList<String> makeRanking(ArrayList<String> options) //make the ranking method
    {
        //how many options - need to rank
        int howMany = options.size();

        //array to track amount of wins each item has
        int[] wins = new int[howMany];

        boolean inputCompleted = gameInput(options, wins); //run the input cycle
            if (!inputCompleted)
            {
                return(null); //quit game
            }

        //Arraylist to order choices
        ArrayList<Integer> order = new ArrayList<Integer>();
        for (int i = 0; i < howMany; i++) 
        {
            order.add(i);
        }

        //sort items by score (highest to lowest) - same logic as other nested loop
        for (int i = 0; i < order.size() - 1; i++)
        {
            for (int j = i + 1; j < order.size(); j++)
            {
                //if j's score > i's score -> swap indexes so highest is first
                if(wins[order.get(j)] > wins [order.get(i)])
                {
                    int swap = order.get(i);
                    order.set(i, order.get(j));
                    order.set(j, swap);
                }
            }
        }

        //final ranking Arraylist
        ArrayList<String> ranking = new ArrayList<String>();
        for (int myIndex : order)
        {
            ranking.add(options.get(myIndex));
        }

        return ranking;

    }
}
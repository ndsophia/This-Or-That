// game controller
import java.util.ArrayList;
import java.util.Scanner;

public class RankingGame 
{
    private static Scanner scanner = new Scanner(System.in);

    public void start()
    {
        System.out.println("-Enter your options one by one");
        System.out.println("-To start ranking type \'rank\'");
        System.out.println("-To quit completely, simply type \'quit\'");

        //getting user input
        ArrayList<String> options = new ArrayList<>();

        //infinite loop that can break whenever player decides
        int count = 1;
        while (true)
        {
            System.out.print("\nOption " + count + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit"))
            {
                System.out.println("Exiting game... Goodbye!");
                return;
            }

            if (input.equalsIgnoreCase("rank"))
            {
                System.out.println("Going to ranking!");
                break;
            }
            options.add(input);
            count++;
        }

        //Run ranking algorithm

        RankingAlgorithm algorithm = new RankingAlgorithm(scanner); //pass scanner through
        ArrayList<String> ranking = algorithm.makeRanking(options);

        if (ranking == null)
        {
            System.out.println("\nNo entry, exiting game... Goodbye!");
            return;

        }

        //print the final ranking
        System.out.println("\n✩°｡♥︎(˶ᵔ ᵕ ᵔ˶) FINAL RANKING (˶ᵔ ᵕ ᵔ˶)♥︎｡°✩\n");
        for (int i = 0; i < ranking.size(); i++)
        {
            System.out.println((i + 1) + ". " + ranking.get(i));
        }

    }


    
}
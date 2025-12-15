// game controller
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class RankingGame 
{
    private static Scanner scanner = new Scanner(System.in);

    public void start()
    {
        System.out.print("\nWelcome! First, enter a category for this ranking (food, work, fashion etc.):\n ");
        String category = scanner.nextLine();

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
                System.out.println("\n  ݁₊ ⊹ . ݁ ⟡ ݁ . ⊹ ₊ ݁. Going to ranking!  ݁₊ ⊹ . ݁ ⟡ ݁ . ⊹ ₊ ݁.");
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
            System.out.println("\nׂ╰┈➤Exiting game... Goodbye!");
            return;

        }

        //print the final ranking
        System.out.println("\n✩°｡♥︎(˶ᵔ ᵕ ᵔ˶) FINAL RANKING (˶ᵔ ᵕ ᵔ˶)♥︎｡°✩\n");
        for (int i = 0; i < ranking.size(); i++)
        {
            System.out.println((i + 1) + ". " + ranking.get(i));
        }
        saveRanking(ranking, category);
        playAgain(scanner);

    }

    private static int fileCount = 1;

    public void saveRanking(ArrayList<String> ranking, String category)
    {
        try
        {
            String fileName = "ranking_" + fileCount + ".txt";
           

            FileWriter writer = new FileWriter(fileName);
            

            writer.write("\n 𖡼.𖤣𖥧𖡼.𖤣𖥧 Save File Ranking #" + fileCount+ " 𖡼.𖤣𖥧𖡼.𖤣𖥧\n");
            writer.write("ᵔᴗᵔ Category: " + category + "\n");
            fileCount++;

            for (int i = 0; i < ranking.size(); i++)
            {
                writer.write((i+1) + ". " + ranking.get(i) + "\n" );
            }

            writer.close();
            System.out.println("\nRanking saved to " + fileName);
        }

        catch (IOException e)
        {
            System.out.println("Error saving");
        }
    }

    public void playAgain(Scanner scanner)
    {
        System.out.println("\nPlay Again?");
        System.out.println("\nPlease enter \'yes\' or \'no\'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes"))
        {
            System.out.println("\n⋆ ˚｡⋆୨♡୧⋆ ˚｡⋆ Welcome back to This or That! ⋆ ˚｡⋆୨♡୧⋆ ˚｡⋆\n");
            start();
        }
        else if (input.equalsIgnoreCase("no"))
        {
            System.out.println("\nCome back soon!");
        }
        else
        {
            System.out.println("\nPlease enter \'yes\' or \'no\'");
        }
    }
    
}
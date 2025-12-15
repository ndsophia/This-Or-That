// junit testing class
    // maven is such a pain

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class RankingAlgorithmTest {
    // test what happens if two options have the same amount of wins
    @Test 
    public void ranking_HandleSameWins() {
        Scanner scan = new Scanner(System.in);
        RankingAlgorithm algo = new RankingAlgorithm(scan);
        int[] wins = new int[3];

        String a = "A";
        String b = "B";
        String c = "C";

        wins[0] = 3;
        wins[1] = 3;
        wins[2] = 3;

        ArrayList<String> options = new ArrayList<String>(); 
        options.add(a);
        options.add(b);
        options.add(c);

        algo.makeRanking(options);
        
    }
}

// junit testing class
    // maven is such a pain

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        wins[2] = 0;

        ArrayList<String> options = new ArrayList<String>(); 
        options.add(a);
        options.add(b);
        options.add(c);

        algo.makeRanking(options);
        algo.gameInput(options, wins);
    }

    // test what game returns if not enough options
    @Test
    public void ranking_HandlesNotEnoughOptions() {
        Scanner scan = new Scanner(System.in);
        RankingAlgorithm algo = new RankingAlgorithm(scan);
        ArrayList<String> options = new ArrayList<String>();

        String a = "A";

        options.add(a); 

        assertNull(algo.makeRanking(options)); 

    }

}

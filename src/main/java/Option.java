// object class

public class Option {
    private final String name; 
    private int wins;
    private int losses;

    public Option(String name) {
        this.name = name; 
        wins = 0;
        losses = 0;
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }

    public void addWins(int n) {
        wins += n; 
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int n) {
        losses = n;
    }
}

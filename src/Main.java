import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 100, 20, 107, 30);
        Fighter f2 = new Fighter("Mike Tyson" , 100, 18, 105, 30);
        Match match = new Match(f1,f2,95,115);
        match.run();
    }
}
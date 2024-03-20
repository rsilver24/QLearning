// Roan Silver      Created: March 8th, 2024        Last Edits: March 20th, 2024

public class MapSolver {
    public static void main(String[] args) {
        Mapping m = new Mapping();
        m.createMap();
        QLearning q = new QLearning();
        q.completeToFile();
        System.out.println("Check 'Results.txt'");
    }
}

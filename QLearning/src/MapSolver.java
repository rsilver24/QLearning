import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MapSolver {
    public static void main(String[] args) {
        try{
            System.out.print("Input the name of the file containing the maze: ");
            Scanner s = new Scanner(System.in);
            File map = new File(s.nextLine());
            File results = new File("Results.txt");
            FileWriter writer = new FileWriter("Results.txt");
            com.technobium.rl.QLearning q = new com.technobium.rl.QLearning();
        } catch (IOException e){
            System.out.println("idk an error happened or smthn");
            e.printStackTrace();
        }
    }
}

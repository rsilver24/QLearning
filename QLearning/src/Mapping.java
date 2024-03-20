// Roan Silver      Created: March 8th, 2024        Last Edits: March 20th, 2024

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Mapping {
    public static void createMap(){
        try {
            File fileOutput = new File("Map.txt");
            FileWriter layout = new FileWriter("Map.txt");
            Random r = new Random();
            int xStart = r.nextInt(0, 3);
            int yStart = r.nextInt(0, 3);
            int xEnd = -1;
            int yEnd = -1;
            boolean valid = false;
            while (!valid){
                xEnd = r.nextInt(0, 3);
                yEnd = r.nextInt(0, 3);
                if (xEnd != xStart && yEnd != yStart){
                    valid = true;
                }
            } for (int k = 0; k < 3; k++){
                for (int i = 0; i < 3; i++){
                    if (i == xStart && k == yStart){
                        layout.write("X ");
                    } else if (i == xEnd && k == yEnd){
                        layout.write("F ");
                    } else{
                        layout.write("0 ");
                    }
                } layout.write(String.format("%n"));
                //SKIP TO NEXT LINE HERE WRITE CODE DON'T FORGET ROAN
            } layout.close();
        } catch (IOException e){
            System.out.println("idk an error happened or smthn");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createMap();
    }
}

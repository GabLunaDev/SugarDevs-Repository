package src;
import src.classes.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { // idk where to start (gab got sick today) ~gus 27/04
        Scanner in = new Scanner (System.in);
        String keepgoing = "YES";

        while(keepgoing.equals("YES")){
            // add stuff

            System.out.println("Would you like to repeat the process or do it again?(Yes or No)");
            keepgoing = in.nextLine().toUpperCase(); 
        }
        
        
    }
}

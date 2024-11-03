import javax.swing.*;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("quit")){
            System.out.println("Input:");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            if (input.equals("twice")) {
                for (int i = 0; i<1; i++){
                    System.out.println("twice");
                }
            }

            System.out.println(input);
        }
    }
}

package partB.ex03;
import java.util.Scanner;
public class DisplayMultiples {
    public static String displayWithMultiples() {
        Scanner scan = new Scanner(System.in);
        int limit = 50;

        System.out.println("Please enter a value:");
        int userInput = scan.nextInt();

        String response = "All of these numbers are a multiple of " + String.valueOf(userInput) + ": \n";

        for (var i = 0; i <= limit; i++){
            if (i % userInput == 0) {response += String.valueOf(i) + " ";}
        }

        return response;
    }

    public static void main(String[] args) {
        String displayOutput = displayWithMultiples();
        System.out.print(displayOutput);
    }
}

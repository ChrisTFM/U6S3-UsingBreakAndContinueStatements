package partB.ex01;

import java.util.Scanner;
import java.util.ArrayList;

public class LoopWithBreak {
    public static String loopWithBreak() {
        Scanner scan = new Scanner(System.in);
        String response = "";
        ArrayList<Double> numberList = new ArrayList<>();

        //Main Loop
        while (true){
            System.out.println("Input a number (Negitive Number to caculate the sum)");
            double userInput = scan.nextDouble();
            if (userInput < 0) {break;}
            numberList.add(userInput);
        }

        //Caculate Sum
        double sum = 0;
        for (var i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }

        response = "Sum = " + String.valueOf(sum);

        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }

}

package partA.ex01;

import java.lang.invoke.VarHandle;
import java.util.Scanner;
import java.util.ArrayList;
public class ComputeSum {

    public static String computeSum() {
        String response = "";

        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number (Type 0 to exit)");
            int user = scan.nextInt();

            if (user == 0) {break;}
            num.add(user);
        }

        int total = 0;

        for (var i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
            total += num.get(i);
        }

        response = "Sum = " + String.valueOf(total);

        return response;
    }

    public static void main(String[] args) {
        String sum = computeSum();
        System.out.print(sum);
    }




}


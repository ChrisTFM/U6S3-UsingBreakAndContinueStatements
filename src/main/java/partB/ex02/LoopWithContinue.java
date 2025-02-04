package partB.ex02;

public class LoopWithContinue {
    public static String loopWithContinue() {
        int i = 0;
        String response = "";
        while (true) {
            i++;
            if (i > 4 && i < 9) {continue;}
            response += String.valueOf(i) + "\n";
            if (i == 10) {break;}
        }
        return response;

    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }

}

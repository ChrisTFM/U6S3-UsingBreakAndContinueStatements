package partA.ex02;

public class CountChar {
    public static String countChar() {
        String str = "asdaw";

        int max = str.length();
        int count = -1;

        for (var i = 0; i < max; i++) {
            if (str.charAt(i) == 'w' || str.charAt(i) == 'W') {
                count = i;
                break;
            }
        }


       str += (" (Counting w : " + count + ")");
        if (count == -1) {str = "No W";}
        return str;
    }

    public static void main(String[] args) {
        String charOutput = countChar();
        System.out.print(charOutput);
    }


    }


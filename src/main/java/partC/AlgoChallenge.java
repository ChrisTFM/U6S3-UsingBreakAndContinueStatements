package partC;

public class AlgoChallenge {
     /* Problem 16
    We are looking to write down a list of all possible numbers that can be a
    multiple of 3 or 5.
    You will be given any number, but to be put on the list the number has to be a non-negative number.

    Return true if the given number can be added to the list.

    Tip: Think about using the % "mod" operator

    Example:
    multipleOf(3) --> true
    multipleOf(10) --> true
    multipleOf(8) --> false
     */


    /* Problem 17
       You are given two random temperatures from different states.
       Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
       Both of these statements need to be true to prove that some states have extreme cases of temperatures.

       Return true, if one temp is less than 0 and the other is greater than 100.

       Example:
       checkTemp(120, -1) --> true
       checkTemp(-1, 120) --> true
       checkTemp(2, 120) --> false
     */

    public static Boolean multipleOf(int number){
        if (number % 3 == 0 || number % 5 == 0) {return true;}
        return false;
    }

    public static Boolean checkTemp(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {return true;}
        if (temp2 < 0 && temp1 > 100) {return true;}
        return true;
    }

    public static void main(String[] args){
        System.out.println(multipleOf(8));
        System.out.println(checkTemp(2, 120));
    }
}

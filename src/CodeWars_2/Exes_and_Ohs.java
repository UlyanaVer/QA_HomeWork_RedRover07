package CodeWars_2;

public class Exes_and_Ohs {
    //Check to see if a string has the same amount of 'x's and 'o's.
    // The method must return a boolean and be case insensitive.
    // The string can contain any char.
    //
    //Examples input/output:
    //XO("ooxx") => true
    //XO("xooxx") => false
    //XO("ooxXm") => true
    //XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    //XO("zzoo") => false
    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        boolean answer = true;
        String strLowCase = str.toLowerCase();

        for (int i = 0; i < strLowCase.length(); i++) {
            if (strLowCase.charAt(i) == 'x') {
                countX++;
            } else if (strLowCase.charAt(i) == 'o') {
                countO++;
            }
        }
        if (countX == countO) {
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getXO("xxxoootrenOOOXXX"));
        System.out.println(getXO("xxxoootrenOOOXX"));
    }
}
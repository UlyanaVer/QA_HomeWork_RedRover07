package CodeWars;

public class HighestAndLowest {
    //In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    //
    //Examples
    //highAndLow("1 2 3 4 5")  // return "5 1"
    //highAndLow("1 2 -3 4 5") // return "5 -3"
    //highAndLow("1 9 3 4 -5") // return "9 -5"
    //Notes
    //All numbers are valid Int32, no need to validate them.
    //There will always be at least one number in the input string.
    //Output string must be two numbers separated by a single space, and highest number is first.
    public static String highAndLow(String numbers) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int elem = 0;

        String[] words = numbers.split(" ");
        for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                elem = Integer.parseInt(word);
                if (elem > max) {
                    max = elem;
                }
                if (elem < min) {
                    min = elem;
                }
            }
        }
        return (String.valueOf(max) + " " + String.valueOf(min));
    }
    public static void main(String[] args) {

        System.out.println(highAndLow("1 2 3 4 9 -6 -9"));
        System.out.println();
    }
}

package Group_intro_verts;

public class return_negative {
    //In this simple assignment you are given a number and have to make it negative.
    // But maybe the number is already negative?
    //
    //Example
    //Kata.MakeNegative(1);  // return -1
    //Kata.MakeNegative(-5); // return -5
    //Kata.MakeNegative(0);  // return 0
    private static double returnNegative(double x) {
        if (x < 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(returnNegative(x));
        System.out.println(returnNegative(-9));
    }
}
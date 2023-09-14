package CodeWars_2;

public class Main {
    public static void main(String[] args) {
        String str = "ooo/oMxxxx";
        int countX = 0;
        int countO = 0;
        String strLowCase = str.toLowerCase();

        for (int i = 0; i < strLowCase.length(); i++) {
            if (strLowCase.charAt(i) == 'x') {
                countX++;
            }else if (strLowCase.charAt(i) == 'o') {
                countO++;
            }
            }
        if (countX == countO) {
            System.out.println("2true");
        } else {
            System.out.println("Not True");
        }
    }
}
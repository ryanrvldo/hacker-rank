package id.ryanrvldo.hackerrank.cci;

public class PalindromeString {

    static boolean isPalindromeString(String str) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : str.toCharArray()) {
            int x = Character.getNumericValue(c) - 10;
            if (x > -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

}

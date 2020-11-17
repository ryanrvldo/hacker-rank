package id.ryanrvldo.hackerrank.cci;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charKey = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int charAt = str.charAt(i);
            if (charKey[charAt]) return false;
            charKey[charAt] = true;
        }
        return true;
    }

    // using another data structure
    static boolean optionalIsUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) return false;
        }
        return true;
    }

}

package id.ryanrvldo.hackerrank.cci;

public class URLify {

    protected static String convertStringToUrl(String str, int length) {
        StringBuilder result = new StringBuilder();
        String spaceInUrl = "%20";
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                result.append(c);
            } else {
                result.append(spaceInUrl);
            }
        }
        return result.toString();
    }

}
